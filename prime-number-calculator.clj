
(defn divisor-test
  "Gets an integer and returns an anonymous function.
  The anonynous function is checks numbers in a list if are they aliquot/divisor for an integer.
  (map (divisor-test 20) [2 3 5 7]) ;=> (true false true false)  "
[pn-?]
#(integer? (/ pn-? %)))

;;;

(defn prime-numbers-to
  "Gets an integer and returns a vector : [prime-numbers < or = n ]
  (prime-numbers-to 20) ;=> [2 3 5 7 11 13 17 19] "
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
  "Checks an integer is it  prime-number or not
  (prime-? 9973) ;=> true "
  [an-int]
  (= (apply max (prime-numbers-to an-int)) an-int))

;;;
