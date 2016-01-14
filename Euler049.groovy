isPrime = {
	candidate ->
	  if (candidate < 2)
		return false
	  if (candidate == 2)
		return true
	  if (candidate % 2 == 0)
		return false
	  limit = Math.ceil(Math.sqrt(candidate)) as int
	  for (int i = 2; i <= limit; i++) {
		if (candidate % i == 0) {
		  return false
		}
	  }
	  return true
  }
  primes = []
  (1009..9949).each {
	if (isPrime(it))
	  primes << it
  }
  primes.each {
	aPrime ->
	  if (aPrime != 1487) {
		compare = aPrime.toString().toList().sort()
		for (int i = 2; i <= (primes.last() - aPrime); i += 2)
		  if (primes.contains(aPrime+i) && primes.contains(aPrime+i+i))
			if ((aPrime+i).toString().toList().sort().equals(compare) &&
				(aPrime+i+i).toString().toList().sort().equals(compare)) {
			  println i+":"+aPrime + ":"+(aPrime+i) + ":"+(aPrime+i+i)
			  println "euler 49 is: "+aPrime+(aPrime+i)+(aPrime+i+i)
			  return
			}
	  }
  }
  
