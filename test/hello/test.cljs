(ns hello.test
  (:require-macros [expectations.cljs :as ecljs])
  (:require [expectations]
            [hello.core-test]))

(defn -main []
  (println "Hello Expectations!")
  (ecljs/run-all-tests))

(enable-console-print!)
(set! *main-cli-fn* -main)
