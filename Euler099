//horribly inefficient
def file = new File(System.getProperty("user.dir")+"\\src\\"+"Euler099.txt")
def lineNo = 1
def line
def maxLine = 1
maxVal = 0
file.withReader { reader ->
   while ((line = reader.readLine())!=null) {
      parts = line.split(",")
      BigInteger theNum = new BigInteger(parts[0])
      value = theNum.pow(new Integer(parts[1]))
      if (value > maxVal) {
         maxVal = value
         maxLine = lineNo
      }
      println "${lineNo}. ${line} -- ${maxLine}"
      lineNo++
   }
}
println maxLine
