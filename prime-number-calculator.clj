
(defn divisor-test
  "Gets an integer and returns an anonymous function.
  The function is checks if numbers in a list are aliquot/divisor for this integer.
  (map (fold-test 20) [2 3 5 7]) ;=> (true false true false)  "
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
              (recur 
                    (if (some true? (map (divisor-test pn-?) pn-list))
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

(map (fold-test 60)
     [2 3 4 5 7 11 15 17 20 23 29 30 37 41 43 47])
;=> (true true true true false false true false true false false true false false false false)

(prime-numbers-to 100)
;=>[2 3 5 7 11 13 17 19 23 29 31 37 41 43 47 53 59 61 67 71 73 79 83 89 97]

(prime-? 9973)
;=> true

;;;
