(ns komokio.themes)

(def themes
  {"basic-bw" {:data
               {:colors/list [[:colors/by-id 0] [:colors/by-id 1]],
                :faces/list
                [[:faces/by-name "default"]
                 [:faces/by-name "background"]
                 [:faces/by-name "builtin"]
                 [:faces/by-name "comment-delimiter"]
                 [:faces/by-name "comment"]
                 [:faces/by-name "constant"]
                 [:faces/by-name "doc"]
                 [:faces/by-name "doc-string"]
                 [:faces/by-name "function-name"]
                 [:faces/by-name "keyword"]
                 [:faces/by-name "negation-char"]
                 [:faces/by-name "preprocessor"]
                 [:faces/by-name "regexp-grouping-backslash"]
                 [:faces/by-name "regexp-grouping-construct"]
                 [:faces/by-name "string"]
                 [:faces/by-name "type"]
                 [:faces/by-name "variable-name"]
                 [:faces/by-name "warning"]]},
               :colors/by-id
               {0 {:color/id 0, :color/rgb "#000000"},
                1 {:color/id 1, :color/rgb "#FFFFFF"}},
               :faces/by-name
               {"function-name"
                {:face/id 8,
                 :face/name "function-name",
                 :face/color [:colors/by-id 0]},
                "string"
                {:face/id 14, :face/name "string", :face/color [:colors/by-id 0]},
                "comment-delimiter"
                {:face/id 3,
                 :face/name "comment-delimiter",
                 :face/color [:colors/by-id 0]},
                "warning"
                {:face/id 17, :face/name "warning", :face/color [:colors/by-id 0]},
                "regexp-grouping-backslash"
                {:face/id 12,
                 :face/name "regexp-grouping-backslash",
                 :face/color [:colors/by-id 0]},
                "constant"
                {:face/id 5, :face/name "constant", :face/color [:colors/by-id 0]},
                "regexp-grouping-construct"
                {:face/id 13,
                 :face/name "regexp-grouping-construct",
                 :face/color [:colors/by-id 0]},
                "preprocessor"
                {:face/id 11,
                 :face/name "preprocessor",
                 :face/color [:colors/by-id 0]},
                "negation-char"
                {:face/id 10,
                 :face/name "negation-char",
                 :face/color [:colors/by-id 0]},
                "keyword"
                {:face/id 9, :face/name "keyword", :face/color [:colors/by-id 0]},
                "variable-name"
                {:face/id 16,
                 :face/name "variable-name",
                 :face/color [:colors/by-id 0]},
                "doc-string"
                {:face/id 7, :face/name "doc-string", :face/color [:colors/by-id 0]},
                "type"
                {:face/id 15, :face/name "type", :face/color [:colors/by-id 0]},
                "comment"
                {:face/id 4, :face/name "comment", :face/color [:colors/by-id 0]},
                "builtin"
                {:face/id 2, :face/name "builtin", :face/color [:colors/by-id 0]},
                "background"
                {:face/id 1, :face/name "background", :face/color [:colors/by-id 1]},
                "default"
                {:face/id 0, :face/name "default", :face/color [:colors/by-id 0]},
                "doc" {:face/id 6, :face/name "doc", :face/color [:colors/by-id 0]}}}

   "basic-light" {:data
                  {:colors/list
                   [[:colors/by-id 0]
                    [:colors/by-id 1]
                    [:colors/by-id 2]
                    [:colors/by-id 3]
                    [:colors/by-id 4]
                    [:colors/by-id 5]
                    [:colors/by-id 6]],
                   :faces/list
                   [[:faces/by-name "default"]
                    [:faces/by-name "background"]
                    [:faces/by-name "builtin"]
                    [:faces/by-name "comment-delimiter"]
                    [:faces/by-name "comment"]
                    [:faces/by-name "constant"]
                    [:faces/by-name "doc"]
                    [:faces/by-name "doc-string"]
                    [:faces/by-name "function-name"]
                    [:faces/by-name "keyword"]
                    [:faces/by-name "negation-char"]
                    [:faces/by-name "preprocessor"]
                    [:faces/by-name "regexp-grouping-backslash"]
                    [:faces/by-name "regexp-grouping-construct"]
                    [:faces/by-name "string"]
                    [:faces/by-name "type"]
                    [:faces/by-name "variable-name"]
                    [:faces/by-name "warning"]]},
                  :colors/by-id
                  {0 {:color/id 0, :color/rgb "#000000"},
                   1 {:color/id 1, :color/rgb "#e6e6e6"},
                   2 {:color/id 2, :color/rgb "#656565"},
                   3 {:color/id 3, :color/rgb "#ff0000"},
                   4 {:color/id 4, :color/rgb "#0c5f27"},
                   5 {:color/id 5, :color/rgb "#7a0888"},
                   6 {:color/id 6, :color/rgb "#d8cd28"}},
                  :faces/by-name
                  {"function-name"
                   {:face/id 8,
                    :face/name "function-name",
                    :face/color [:colors/by-id 5]},
                   "string"
                   {:face/id 14, :face/name "string", :face/color [:colors/by-id 5]},
                   "comment-delimiter"
                   {:face/id 3,
                    :face/name "comment-delimiter",
                    :face/color [:colors/by-id 2]},
                   "warning"
                   {:face/id 17, :face/name "warning", :face/color [:colors/by-id 3]},
                   "regexp-grouping-backslash"
                   {:face/id 12,
                    :face/name "regexp-grouping-backslash",
                    :face/color [:colors/by-id 0]},
                   "constant"
                   {:face/id 5, :face/name "constant", :face/color [:colors/by-id 0]},
                   "regexp-grouping-construct"
                   {:face/id 13,
                    :face/name "regexp-grouping-construct",
                    :face/color [:colors/by-id 0]},
                   "preprocessor"
                   {:face/id 11,
                    :face/name "preprocessor",
                    :face/color [:colors/by-id 6]},
                   "negation-char"
                   {:face/id 10,
                    :face/name "negation-char",
                    :face/color [:colors/by-id 0]},
                   "keyword"
                   {:face/id 9, :face/name "keyword", :face/color [:colors/by-id 3]},
                   "variable-name"
                   {:face/id 16,
                    :face/name "variable-name",
                    :face/color [:colors/by-id 5]},
                   "doc-string"
                   {:face/id 7, :face/name "doc-string", :face/color [:colors/by-id 4]},
                   "type"
                   {:face/id 15, :face/name "type", :face/color [:colors/by-id 3]},
                   "comment"
                   {:face/id 4, :face/name "comment", :face/color [:colors/by-id 2]},
                   "builtin"
                   {:face/id 2, :face/name "builtin", :face/color [:colors/by-id 3]},
                   "background"
                   {:face/id 1, :face/name "background", :face/color [:colors/by-id 1]},
                   "default"
                   {:face/id 0, :face/name "default", :face/color [:colors/by-id 0]},
                   "doc" {:face/id 6, :face/name "doc", :face/color [:colors/by-id 4]}}}

   "solarized-dark" {:data
                     {:colors/list
                      [[:colors/by-id 0]
                       [:colors/by-id 1]
                       [:colors/by-id 2]
                       [:colors/by-id 3]
                       [:colors/by-id 4]
                       [:colors/by-id 5]
                       [:colors/by-id 6]
                       [:colors/by-id 7]
                       [:colors/by-id 8]
                       [:colors/by-id 9]],
                      :faces/list
                      [[:faces/by-name "default"]
                       [:faces/by-name "background"]
                       [:faces/by-name "builtin"]
                       [:faces/by-name "comment-delimiter"]
                       [:faces/by-name "comment"]
                       [:faces/by-name "constant"]
                       [:faces/by-name "doc"]
                       [:faces/by-name "doc-string"]
                       [:faces/by-name "function-name"]
                       [:faces/by-name "keyword"]
                       [:faces/by-name "negation-char"]
                       [:faces/by-name "preprocessor"]
                       [:faces/by-name "regexp-grouping-backslash"]
                       [:faces/by-name "regexp-grouping-construct"]
                       [:faces/by-name "string"]
                       [:faces/by-name "type"]
                       [:faces/by-name "variable-name"]
                       [:faces/by-name "warning"]]},
                     :colors/by-id
                     {0 {:color/id 0, :color/rgb "#6c71c4"},
                      1 {:color/id 1, :color/rgb "#586e75"},
                      2 {:color/id 2, :color/rgb "#268bd2"},
                      3 {:color/id 3, :color/rgb "#d33682"},
                      4 {:color/id 4, :color/rgb "#b58900"},
                      5 {:color/id 5, :color/rgb "#859900"},
                      6 {:color/id 6, :color/rgb "#2aa198"},
                      7 {:color/id 7, :color/rgb "#dc322f"},
                      8 {:color/id 8, :color/rgb "#073642"},
                      9 {:color/id 9, :color/rgb "#93a1a1"}},
                     :faces/by-name
                     {"function-name"
                      {:face/id 8,
                       :face/name "function-name",
                       :face/color [:colors/by-id 4]},
                      "string"
                      {:face/id 14, :face/name "string", :face/color [:colors/by-id 6]},
                      "comment-delimiter"
                      {:face/id 3,
                       :face/name "comment-delimiter",
                       :face/color [:colors/by-id 1]},
                      "warning"
                      {:face/id 17, :face/name "warning", :face/color [:colors/by-id 7]},
                      "regexp-grouping-backslash"
                      {:face/id 12,
                       :face/name "regexp-grouping-backslash",
                       :face/color [:colors/by-id 0]},
                      "constant"
                      {:face/id 5, :face/name "constant", :face/color [:colors/by-id 2]},
                      "regexp-grouping-construct"
                      {:face/id 13,
                       :face/name "regexp-grouping-construct",
                       :face/color [:colors/by-id 3]},
                      "preprocessor"
                      {:face/id 11,
                       :face/name "preprocessor",
                       :face/color [:colors/by-id 3]},
                      "negation-char"
                      {:face/id 10,
                       :face/name "negation-char",
                       :face/color [:colors/by-id 2]},
                      "keyword"
                      {:face/id 9, :face/name "keyword", :face/color [:colors/by-id 5]},
                      "variable-name"
                      {:face/id 16,
                       :face/name "variable-name",
                       :face/color [:colors/by-id 0]},
                      "doc-string"
                      {:face/id 7, :face/name "doc-string", :face/color [:colors/by-id 0]},
                      "type"
                      {:face/id 15, :face/name "type", :face/color [:colors/by-id 2]},
                      "comment"
                      {:face/id 4, :face/name "comment", :face/color [:colors/by-id 1]},
                      "builtin"
                      {:face/id 2, :face/name "builtin", :face/color [:colors/by-id 0]},
                      "background"
                      {:face/id 1, :face/name "background", :face/color [:colors/by-id 8]},
                      "default"
                      {:face/id 0, :face/name "default", :face/color [:colors/by-id 9]},
                      "doc" {:face/id 6, :face/name "doc", :face/color [:colors/by-id 3]}}}

   "mouse" {:data
            {:colors/list
             [[:colors/by-id 0]
              [:colors/by-id 1]
              [:colors/by-id 2]
              [:colors/by-id 3]
              [:colors/by-id 4]
              [:colors/by-id 5]],
             :faces/list
             [[:faces/by-name "default"]
              [:faces/by-name "background"]
              [:faces/by-name "builtin"]
              [:faces/by-name "comment-delimiter"]
              [:faces/by-name "comment"]
              [:faces/by-name "constant"]
              [:faces/by-name "doc"]
              [:faces/by-name "doc-string"]
              [:faces/by-name "function-name"]
              [:faces/by-name "keyword"]
              [:faces/by-name "negation-char"]
              [:faces/by-name "preprocessor"]
              [:faces/by-name "regexp-grouping-backslash"]
              [:faces/by-name "regexp-grouping-construct"]
              [:faces/by-name "string"]
              [:faces/by-name "type"]
              [:faces/by-name "variable-name"]
              [:faces/by-name "warning"]]},
            :colors/by-id
            {0 {:color/id 0, :color/rgb "#737272"},
             1 {:color/id 1, :color/rgb "#2e2e2e"},
             2 {:color/id 2, :color/rgb "#ff2fd3"},
             3 {:color/id 3, :color/rgb "#bfbfbf"},
             4 {:color/id 4, :color/rgb "#dfde31"},
             5 {:color/id 5, :color/rgb "#ffffff"},
             6 {:color/id 6, :color/rgb "#2aa198"},
             7 {:color/id 7, :color/rgb "#dc322f"},
             8 {:color/id 8, :color/rgb "#073642"},
             9 {:color/id 9, :color/rgb "#93a1a1"}},
            :faces/by-name
            {"function-name"
             {:face/id 8,
              :face/name "function-name",
              :face/color [:colors/by-id 4]},
             "string"
             {:face/id 14, :face/name "string", :face/color [:colors/by-id 5]},
             "comment-delimiter"
             {:face/id 3,
              :face/name "comment-delimiter",
              :face/color [:colors/by-id 0]},
             "warning"
             {:face/id 17, :face/name "warning", :face/color [:colors/by-id 0]},
             "regexp-grouping-backslash"
             {:face/id 12,
              :face/name "regexp-grouping-backslash",
              :face/color [:colors/by-id 0]},
             "constant"
             {:face/id 5, :face/name "constant", :face/color [:colors/by-id 4]},
             "regexp-grouping-construct"
             {:face/id 13,
              :face/name "regexp-grouping-construct",
              :face/color [:colors/by-id 0]},
             "preprocessor"
             {:face/id 11,
              :face/name "preprocessor",
              :face/color [:colors/by-id 0]},
             "negation-char"
             {:face/id 10,
              :face/name "negation-char",
              :face/color [:colors/by-id 0]},
             "keyword"
             {:face/id 9, :face/name "keyword", :face/color [:colors/by-id 2]},
             "variable-name"
             {:face/id 16,
              :face/name "variable-name",
              :face/color [:colors/by-id 4]},
             "doc-string"
             {:face/id 7, :face/name "doc-string", :face/color [:colors/by-id 0]},
             "type"
             {:face/id 15, :face/name "type", :face/color [:colors/by-id 0]},
             "comment"
             {:face/id 4, :face/name "comment", :face/color [:colors/by-id 0]},
             "builtin"
             {:face/id 2, :face/name "builtin", :face/color [:colors/by-id 4]},
             "background"
             {:face/id 1, :face/name "background", :face/color [:colors/by-id 1]},
             "default"
             {:face/id 0, :face/name "default", :face/color [:colors/by-id 3]},
             "doc" {:face/id 6, :face/name "doc", :face/color [:colors/by-id 0]}}}
   "electric-toothbrush" {:data
                          {:colors/list
                           [[:colors/by-id 0]
                            [:colors/by-id 1]
                            [:colors/by-id 2]
                            [:colors/by-id 3]
                            [:colors/by-id 4]
                            [:colors/by-id 5]
                            [:colors/by-id 6]
                            [:colors/by-id 7]
                            [:colors/by-id 8]
                            [:colors/by-id 9]],
                           :faces/list
                           [[:faces/by-name "default"]
                            [:faces/by-name "background"]
                            [:faces/by-name "builtin"]
                            [:faces/by-name "comment-delimiter"]
                            [:faces/by-name "comment"]
                            [:faces/by-name "constant"]
                            [:faces/by-name "doc"]
                            [:faces/by-name "doc-string"]
                            [:faces/by-name "function-name"]
                            [:faces/by-name "keyword"]
                            [:faces/by-name "negation-char"]
                            [:faces/by-name "preprocessor"]
                            [:faces/by-name "regexp-grouping-backslash"]
                            [:faces/by-name "regexp-grouping-construct"]
                            [:faces/by-name "string"]
                            [:faces/by-name "type"]
                            [:faces/by-name "variable-name"]
                            [:faces/by-name "warning"]]},
                          :colors/by-id
                          {0 {:color/id 0, :color/rgb "#151a73"},
                           1 {:color/id 1, :color/rgb "#4c5557"},
                           2 {:color/id 2, :color/rgb "#0096ff"},
                           3 {:color/id 3, :color/rgb "#ffa3d0"},
                           4 {:color/id 4, :color/rgb "#ffc200"},
                           5 {:color/id 5, :color/rgb "#d9fa00"},
                           6 {:color/id 6, :color/rgb "#7ffff6"},
                           7 {:color/id 7, :color/rgb "#dc322f"},
                           8 {:color/id 8, :color/rgb "#8d8d8d"},
                           9 {:color/id 9, :color/rgb "#8e0081"}},
                          :faces/by-name
                          {"function-name"
                           {:face/id 8,
                            :face/name "function-name",
                            :face/color [:colors/by-id 4]},
                           "string"
                           {:face/id 14, :face/name "string", :face/color [:colors/by-id 6]},
                           "comment-delimiter"
                           {:face/id 3,
                            :face/name "comment-delimiter",
                            :face/color [:colors/by-id 1]},
                           "warning"
                           {:face/id 17, :face/name "warning", :face/color [:colors/by-id 7]},
                           "regexp-grouping-backslash"
                           {:face/id 12,
                            :face/name "regexp-grouping-backslash",
                            :face/color [:colors/by-id 0]},
                           "constant"
                           {:face/id 5, :face/name "constant", :face/color [:colors/by-id 2]},
                           "regexp-grouping-construct"
                           {:face/id 13,
                            :face/name "regexp-grouping-construct",
                            :face/color [:colors/by-id 3]},
                           "preprocessor"
                           {:face/id 11,
                            :face/name "preprocessor",
                            :face/color [:colors/by-id 3]},
                           "negation-char"
                           {:face/id 10,
                            :face/name "negation-char",
                            :face/color [:colors/by-id 2]},
                           "keyword"
                           {:face/id 9, :face/name "keyword", :face/color [:colors/by-id 5]},
                           "variable-name"
                           {:face/id 16,
                            :face/name "variable-name",
                            :face/color [:colors/by-id 0]},
                           "doc-string"
                           {:face/id 7, :face/name "doc-string", :face/color [:colors/by-id 0]},
                           "type"
                           {:face/id 15, :face/name "type", :face/color [:colors/by-id 2]},
                           "comment"
                           {:face/id 4, :face/name "comment", :face/color [:colors/by-id 1]},
                           "builtin"
                           {:face/id 2, :face/name "builtin", :face/color [:colors/by-id 0]},
                           "background"
                           {:face/id 1, :face/name "background", :face/color [:colors/by-id 8]},
                           "default"
                           {:face/id 0, :face/name "default", :face/color [:colors/by-id 9]},
                           "doc" {:face/id 6, :face/name "doc", :face/color [:colors/by-id 3]}}}})