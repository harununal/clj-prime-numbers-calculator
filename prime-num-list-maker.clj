
(defn fold-?
"This function takes a *prime-numbers list* and creates anonymous function.
 Unnamed function checks if a number is fold to any numbers in prime-numbers list"
[pn-?]
#(integer? (/ pn-? %)))

(defn pnl-number-list
"This function take a number and create a prime numbers list 
 that smaller than this number or equal to this"
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

;;;;;;;;;;;;;;;;;;;;;;;;

(pnl-number 2)


(defn prime-?
[x]
(= (apply max (pnl-number x)) x))

(prime-? 2)

