divisors = {
	divisee ->
	  candidates = []
	  (1..(int)Math.sqrt(divisee)).each {
		candidate ->
		  if (divisee % candidate == 0)
			candidates << candidate << (divisee/candidate).toInteger()
	  }
	  (candidates - divisee).unique()
  }
  
  isAbundant = {
	num ->
	  divisors(num).sum() > num
  }
  
  println "Starting"
  abundants = []
  tally = 0
  (1..28123).each {
	num ->
	  if (isAbundant(num))
		abundants << num
		sumCand = true
		println num
		for (Integer abundant: abundants) {
		  if (abundants.contains( (num - abundant))) {
			sumCand = false
	 //println num+":"+abundant+":"+(num - abundant)+abundants
			break
		  }
		}
		if (sumCand)
		  //println num //+":"+abundants
		  tally += num
  }
  println tally
 
