# Prime Numbers Calculator on Clojure
### 1. Makes a list of prime numbers they are smaller than an integer or equal 
***(prime-numbers-to 100)***
>;=>[2 3 5 7 11 13 17 19 23 29 31 37 41 43 47 53 59 61 67 71 73 79 83 89 97]

> (time (prime-numbers-to 10)) ;"Elapsed time: 0.17576 msecs"

> (time (prime-numbers-to 100)) ; "Elapsed time: 1.46643 msecs"

> (time (prime-numbers-to 1000)) ; "Elapsed time: 33.02275 msecs"

> (time (prime-numbers-to 10000)) ; "Elapsed time: 422.90461 msecs"

> (time (prime-numbers-to 100000)) ; "Elapsed time: 18883.849173 msecs"

### 2. Check an integer if is it a prime-number :
***(prime-? 9973)***
>;=> true

### 3. Checks numbers in a list if are they aliquot/divisor for an integer :

***(map (fold-test 60) [2 3 4 5 7 11 15 17 20 23 29 30 37 41 43 47] )***
>;=> (true true true true false false true false true false false true false false false false)

