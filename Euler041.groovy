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
isPandigital = {
  pandigital ->
    if (isPrime(pandigital)) {
      Set tester = new HashSet()
      pandigital.toString().each {
        if (!tester.add(it))
          return false
      }
      if (tester.toList().sort().join("").equals("1234567"))
        return true
      else
        return false
    }
    return false
}

for (int i = 7654321; i >= 7123456; i--)
  if (isPandigital(i)) {
    println "euler41 is " + i
    break
  }
