(defproject expectations-hello-cljs "0.1.0-SNAPSHOT"
  :description "FIXME: write this!"
  :url "http://example.com/FIXME"

  :dependencies [[org.clojure/clojure "1.6.0"]
                 [org.clojure/clojurescript "0.0-2913"]]

  :profiles {:dev {:dependencies [[expectations "2.1.1"]]}}

  :node-dependencies [[source-map-support "^0.2.9"]]

  :plugins [[lein-cljsbuild "1.0.5"]
            [lein-npm "0.5.0"]]

  :source-paths ["src" "target/classes"]

  :clean-targets ["out" "out-adv"]

  :cljsbuild {:builds [{:id             "test"
                        :source-paths   ["src" "test"]
                        :notify-command ["node" "./out/test.js"]
                        :compiler       {:target         :nodejs
                                         :main           hello.test
                                         :output-to      "out/test.js"
                                         :output-dir     "out"
                                         :optimizations  :none
                                         :cache-analysis true
                                         :source-map     true}}
                       {:id           "release"
                        :source-paths ["src"]
                        :compiler     {:main          hello.core
                                       :output-to     "out-adv/hello.min.js"
                                       :output-dir    "out-adv"
                                       :optimizations :advanced
                                       :pretty-print  false}}]})
