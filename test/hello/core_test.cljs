(ns hello.core-test
  (:require [expectations :refer-macros [expect
                                         expect-focused]]))

(expect 1 1)

(expect js/Error (throw (js/Error. "Hi!")))