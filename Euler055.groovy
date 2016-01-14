isPalindrome = {
  aString ->
    aString.reverse().equals(aString)
}

isLychrel = {
  lychrel ->
      for (int i = 0; i < 50; i++) {
      answer = (lychrel.toBigInteger() + lychrel.reverse().toBigInteger())
      if (isPalindrome(answer.toString())) {
        return false
      }
      else lychrel = answer.toString()
    }
    return true
}

def lychrelTally = 0
(1..10000).each {
  if (isLychrel(it.toString())) {
    lychrelTally++
  }
}
println "Euler 55 is "+lychrelTally
