(ns clojure-ftbt-exercises.core)

(defn c4-1a 
  "Using str and map at same time"
  [& args]
  (map #(str % " is so cute!!!") args))

"Using vector with anonymous function"
(def c4-1b #(vector % %2))

"OMG, it's really easy make sums"
(def c4-2 #(+ % 100))

"Dec-maker. Ok, it is not so easy, so let's explain:
1 is my-dec param [d]. When I call my-maker passing
a number as argument, % represents this number."
(defn my-dec
  [d]
  #(- % d))
(def c4-3 (my-dec 1))

"???It isn't really clear, so lets try with some strings.
Yep, always % will be the external params."
(defn my-str
  [s]
  #(str %1 " " %2 s))
(def c4-3plus (my-str " is so cute")) 

"It's a function that return a set of incremented numbers"
(defn c4-4
  [[& a]]
  (set (map inc a)))

"Now is the truth time."
(def asym-alien-body-parts [{:name "head" :size 3}
                            {:name "first-eye" :size 1}
                            {:name "first-ear" :size 1}
                            {:name "mouth" :size 1}
                            {:name "neck" :size 2}
                            {:name "first-shoulder" :size 3}
                            {:name "first-upper-arm" :size 3}
                            {:name "" :size }
                            
                            
