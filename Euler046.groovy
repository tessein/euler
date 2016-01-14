isPrime = {
  candidate ->
    if (candidate % 2 == 0 || candidate < 2)
      return false
    if (candidate == 2)
      return true
    limit = Math.ceil(Math.sqrt(candidate)) as int
    for (int i = 2; i <= limit; i++)
      if (candidate % i == 0)
        return false
    return true
}


for (i = 3; ; i += 2) {
  if (!isPrime(i)) {
    candidates = 0
    for (j = 1; j < i / 2; j++) {
      if (j % Math.sqrt(j) == 0 && isPrime( ( i - 2 * j ) ) )
          candidates++
    }
    if (candidates == 0) {
      println "FOUND IT!!! " + i
      break
    }
  }
}
