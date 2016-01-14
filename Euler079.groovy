/* works, but takes way too long */
gcd = {
  a, b ->
  if (b==0) return a;
  return gcd(b,a%b);
}

bottom = 0.3333333333333333333
top = 0.5
total = 0
(2..12000).each {
 denom ->
 println denom
   (1..denom).each {
     num ->
       temp = ((num * 1.0) / denom)
       if (temp > bottom && temp < top)
         if (gcd( denom, num ) == 1)
           total++
   }
}

println "euler73 = "+total
