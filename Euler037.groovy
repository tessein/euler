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
(11..999999).each {
  candidate ->
    if (isPrime(candidate)) {
      chars = candidate.toString().toList()
      prime = true
      while (chars.size() > 1) {
        chars.pop()
        newCand = chars.join("").toInteger()
        if (!isPrime(newCand)) {
          prime = false
          break
        }
      }
      chars = candidate.toString().toList()
      while ( chars.size() > 1) {
        chars.remove(0)
        newCand = chars.join("").toInteger()
        if (!isPrime(newCand)) {
          prime = false
          break
        }
      }
      if (prime)
        primes.add(candidate)
          
    }
}
println primes
println primes.sum()
