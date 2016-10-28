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

"Now is the truth time. Let's try all at same time.
At first, I had defined a vector with asymmetrical
alien body parts in hash-maps."
(def asym-alien-body-parts [{:name "head" :size 3}
                            {:name "first-eye" :size 1}
                            {:name "first-ear" :size 1}
                            {:name "mouth" :size 1}
                            {:name "neck" :size 2}
                            {:name "first-shoulder" :size 3}
                            {:name "first-upper-arm" :size 3}
                            {:name "chest" :size 10}
                            {:name "back" :size 10}
                            {:name "first-forearm" :size 3}
                            {:name "abdomen" :size 6}
                            {:name "first-kidney" :size 1}
                            {:name "first-hand" :size 2}
                            {:name "first-knee" :size 2}
                            {:name "first-thigh" :size 4}
                            {:name "first-lower-leg" :size 3}
                            {:name "first-achilles" :size 1}
                            {:name "first-foot" :size 2}])
"This function creates the another alien parts"                            
(defn matching-part
  [part n]
  (if (clojure.string/includes? #"^first-" part) {:name (clojure.string/replace (:name part) #"^first-" (str n "th-"))
  :size (:size part)} nil))
(defn symmetrize-body-parts
  [asym-body-parts]
  (loop [remaining-asym-parts asym-body-parts final-body-parts[]]
    (if (empty? remaining-asym-parts)
      final-body-parts
      (let [[part & remaining] remaining-asym-parts]
        (recur remaining
               (into final-body-parts
                     (loop [n 2 set-of-parts []]
                       (println set-of-parts)
                       (if (> n 5)
                         set-of-parts
                         (recur (inc n) (into set-of-parts (set [part (matching-part part n)]))))
                     )
               )
        )
      )
    )
  )
)
