
(defn fold-?
"
 This function takes a *prime-numbers list* and creates anonymous function.
 Unnamed function checks if a number is fold to any numbers in prime-numbers list.
 
 (map (fold-? 20) [2 3 5 7])
;=> (true false true false)
 
 "
[pn-?]
#(integer? (/ pn-? %)))



(defn pnl-number-list
"
 This function take a number and create a prime numbers list 
 that smaller than this number or equal to this
 
 (pnl-number-list 20)
 ;=> [2 3 5 7 11 13 17 19]
 
 (pnl-number-list 7)
 ;=> [2 3 5 7]
 
 "
[max-val]
(if (>= max-val 2)
    (loop [pn-list [2]
           pn-? 3]
          (if (< max-val pn-?)
              pn-list
              (recur 
                    (if (some true? (map (fold-? pn-?) pn-list))
                        pn-list
                        (conj pn-list pn-?))
                    (inc pn-?))))))

;;;;;;;;;;;;;;;;;; fold-? and pnl-number-list is inseperable ;;;;;;;;;;;;;;;;;;;;

(defn prime-?
"
 This function is check if a number is a prime-number.
 
 (prime-? 7919) ;=> true
 
 "
[x]
(= (apply max (pnl-number x)) x))



