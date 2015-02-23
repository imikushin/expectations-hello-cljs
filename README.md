# expectations-hello-cljs

Sample ClojureScript project for Expectations testing framework. Enjoy!

## Setup

First-time Clojurescript developers, add the following to your bash .profile:

    export LEIN_FAST_TRAMPOLINE=y
    alias cljsbuild="lein trampoline cljsbuild $@"

To avoid compiling ClojureScript for each build, AOT Clojurescript locally in your project with the following:

    ./scripts/compile_cljsc

Subsequent dev builds can use:

    lein cljsbuild auto test

To start a Node REPL (requires rlwrap):

    ./scripts/repl

To get source map support in the Node REPL:

    lein npm install

Clean project specific out:

    lein clean
     
Optimized builds:

    lein cljsbuild once release     


## License

Copyright © 2014 Ivan Mikushin

Distributed under the Eclipse Public License either version 1.0 or (at your option) any later version.
