;; create the main project namespace
;; every cljs file must start with a namespace declaration
(ns modern-cljs.core)

(defn add [x y]
  (+ x y))

(defn minus [x y]
  (- x y))

(defn multiply [x y]
  (* x y))

(defn division [x y]
  (/ x y))

(set! js/add add)
(set! js/minus minus)
(set! js/multiply multiply)
(set! js/division division)

;; enable cljs to print to the javascript console
(enable-console-print!)

;; print to the console
(println "Hello world!")
(println (str "Hello again " "world!!!"))
