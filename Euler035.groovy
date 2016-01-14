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
      if (candidate % i == 0)
        return false
    }
    return true
}

tally = 0
(999999..2).each {
  candidate ->
    if (isPrime(candidate)) {
      def chars = candidate.toString().toCharArray()

      prime = true
      for (int i = 1; i <= chars.length -1; i++) {
        firstChar = chars[chars.length - 1]
        ((chars.length-1)..1).each {
          chars[it] = chars[it-1]
        }
        chars[0] = firstChar
        primeCandidate =  new String(chars).toInteger()
        if (!isPrime(primeCandidate)) {
          prime = false
          break
        }
      }
      if (prime)
        tally++
    }
}
println tally
