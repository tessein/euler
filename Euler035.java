import java.math.BigInteger;
/**
 * @author ctessein
 *
 */
public class Euler035 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		long tally = 6; // 2,3,5,7,11,13 are circularly prime
		for (int i = 17; i <= 999999; i+= 2) {
			BigInteger primeCandidate = new BigInteger(String.valueOf(i));
			if (primeCandidate.isProbablePrime(1)) {
				tally++;
			}
		}
		System.out.println(tally);
/*
 * tally = 0
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

 */
	}

}
