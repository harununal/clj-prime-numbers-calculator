
(defn divisor-test
[pn-?]
#(integer? (/ pn-? %)))

;;;

(defn prime-numbers-to
[max-val]
(loop [pn-list [2]
       pn-? 3]
      (if (< max-val pn-?)
           pn-list
          (recur (if (some true? (map (divisor-test pn-?) pn-list))
                     pn-list
                    (conj pn-list pn-?))
                 (inc pn-?)))))

;;;

(defn prime-?
  [an-int]
  (= (apply max (prime-numbers-to an-int)) an-int))

;;;
