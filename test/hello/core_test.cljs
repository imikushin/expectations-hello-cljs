(ns hello.core-test
  (:require [expectations :refer [in localize no-op] :refer-macros [expect
                                                                    expect-focused
                                                                    expect-let
                                                                    expect-let-focused
                                                                    from-each
                                                                    more
                                                                    more->
                                                                    more-of
                                                                    redef-state
                                                                    side-effects]]))

(expect 1 1)

(expect js/Error (throw (js/Error. "Hi!")))