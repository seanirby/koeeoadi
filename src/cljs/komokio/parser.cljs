(ns komokio.parser
  (:require [om.next :as om]
            [cljs.pprint :as pprint]

            [komokio.components.widgets :refer [Widgets]]
            [komokio.components.palette :refer [Color]]
            [komokio.components.palettepicker :refer [PalettePicker]]))

;; Readers
(defmulti read om/dispatch)

(defmethod read :default
  [{:keys [state query] :as env} k params]
  (let [st @state] ;; CACHING!!!
    (if (contains? st k)
      {:value (get st k)}
      {:remote true})))

(defmethod read :widgets
  [{:keys [state query] :as env} k params]
  (let [st @state
        widgets-query [{:widgets query}]
        ;; TODO use ident instead of get-in
        widgets-tree  {:widgets {:code-display {:code-chunks/list [:data :code-chunks/list]
                                                :code-background [:faces/by-name "background"]}
                                 :palette-picker (get st :palette-picker)
                                 :sidebar      {:faces   {:faces/list [:data :faces/list]}
                                                :palette {:colors/list [:data :colors/list]}}}}
        widgets       (om/db->tree widgets-query widgets-tree st)]
    {:value (:widgets widgets)}))

(defn sub-colors [face state-derefed]
  (-> face
    (update :face/color #(if (empty? %) nil (get-in state-derefed %)))))

(defn sub-face [code state-derefed]
  (update code :face #(sub-colors (get-in state-derefed %) state-derefed)))

(defn get-code-chunks [state]
  (let [st @state]
    (into [] (map #(sub-face (get-in st %) st)) (get st :code-chunks/list))))

(defmethod read :code-chunks/list
  [{:keys [state] :as env} _ _]
  {:value (get-code-chunks state)})

(defmethod read :palette-picker
  [{:keys [state] :as env} _ _]
  (let [pp (om/db->tree [{:palette-picker (om/get-query PalettePicker)}]  @state @state)]
    {:value (:palette-picker pp)}))

(defn get-colors [state]
  (let [st @state]
    (into [] (map #(get-in st %)) (get st :colors/list))))

(defmethod read :colors/list
  [{:keys [state] :as env} _ _]
  {:value (get-colors state)})

(defmethod read :color-options/list
  [{:keys [state] :as env} _ _]
  {:value (get-colors state)})

(defn get-face [state-derefed face-ident]
  (let [face (get-in state-derefed face-ident)
        color (get-in state-derefed (:face/color face))]
    (merge face {:face/color color})))

(defn get-faces [state key]
  (let [st @state]
    (into [] (map #(get-face st %)) (get st key))))

(defmethod read :faces/list
  [{:keys [state query] :as env} k params]
  {:value (get-faces state k)})

;;** Mutators
(defmulti mutate om/dispatch)

;; non-local
(defmethod mutate :default
  [_ _ _] {:remote true})

(defn new-color-id [colors]
  (let [ids (sort-by #(- (last %)) colors)]
    (inc (last (first ids)))))

(defmethod mutate 'colors/add
  [{:keys [state] :as env} _ _]
  {:value {:keys [:faces/list]}
   :action
   (fn []
     (let [st      @state
           new-id  (new-color-id (get-in st [:data :colors/list]))
           state'  (update-in st [:colors/by-id] merge {new-id {:color/id new-id}})
           state'' (update-in state' [:data :colors/list] conj [:colors/by-id new-id])]
       (reset! state state'')))})

(defmethod mutate 'color/update
  [{:keys [state ref] :as env} _ {:keys [id rgb] :as args}]
  {:value {:keys [:faces/list]}
   :action
   (fn []
     (swap! state update-in [:colors/by-id id] assoc :color/rgb rgb))})

(defmethod mutate 'face/update
  [{:keys [state ref] :as env} _ {:keys [name color] :as args}]
  {:value {:keys [:faces/list]}
   :action
   (fn []
     (swap! state update-in [:faces/by-name name] assoc :face/color [:colors/by-id (:color/id color)]))})

(defmethod mutate 'palette-picker/update
  [{:keys [state ref] :as env} _ args]
  {:value {:keys [:palette-picker]}
   :action
   (fn []
     (swap! state update-in [:palette-picker] merge args {:colors/list (get-in @state [:data :colors/list])}))})

(def parser (om/parser {:read read :mutate mutate}))

(update-in {} [:beeodfll] #(identity 5))
