
(defn divisor-test
"Makes a list of prime numbers they are smaller than an integer or equal"
[pn-?]
#(integer? (/ pn-? %)))

;;;

(defn prime-numbers-to
"Checks an integer if is it a prime-number"
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
"Checks numbers in a list if are they aliquot/divisor for an integer "
  [an-int]
  (= (apply max (prime-numbers-to an-int)) an-int))

;;;
