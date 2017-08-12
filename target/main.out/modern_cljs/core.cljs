;; create the main project namespace
;; every cljs file must start with a namespace declaration
(ns modern-cljs.core)

(defn add [x y]
  (+ x y))

(set! js/add add)

;; enable cljs to print to the javascript console
(enable-console-print!)

;; print to the console
(println "Hello world!")
