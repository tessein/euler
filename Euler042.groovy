import java.io.File;

triangleNumber = new ArrayList(100)
(1..100).each {
  triangleNumber.add((0.5 * it * (it + 1)).intValue())
}

def words = ((new File(System.getProperty("user.dir")+"\\src\\"+"Euler042.txt")).text).replaceAll('"', '').split(',')

triangleTally = 0
words.each {
  word -> 
    wordValue = 0
    for(char c : word.toCharArray())
      wordValue += " ABCDEFGHIJKLMNOPQRSTUVWXYZ".indexOf(Character.toString(c))
    if (triangleNumber.contains(wordValue))
      triangleTally++
}
println triangleTally
