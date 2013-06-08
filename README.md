# system-slash-exit

A Clojure library designed to exit the jvm.

## Wait what?

It just has a var that wraps `(System/exit n)` so you can e.g.,
redefine it in a test, or anything else that you can do with a var
that you can't do with a static method. Use your imagination.

## Obtainage

In Leiningen's `project.clj`:

``` clojure
[com.gfredericks/system-slash-exit "0.1.1"]
```

## Usage

``` clojure
(require '[com.gfredericks.system-slash-exit :refer [exit]])

(exit 0) ;; or just (exit)
```

## License

Copyright © 2013 Gary Fredericks

Distributed under the Eclipse Public License, the same as Clojure.
