ones = eightynines = 0
(1..9999999).each {
  answer ->
    //println "\n**> " + answer
    while (answer != 1 && answer != 89) {
      numbers = answer.toString().toList()
      temp = 0
      numbers.each {
        i ->
          temp += (i.toInteger())**2
      }
      answer = temp
      //print answer+" ->"
    }
    if (answer == 1) ones++
    else if (answer == 89) eightynines++
//println "1: "+ones+" -- 89: "+eightynines
if ((ones+eightynines) % 1000000 == 0) print "."
}
println "1: "+ones+" -- 89: "+eightynines
println "Solution is: " + eightynines
