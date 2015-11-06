import java.math.BigInteger;

/**
 * @author ctessein
 * 
 */
public class Euler020 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		final long startTime = System.currentTimeMillis();
		int tally = 0;
		char[] theDigits = Utility.factorial(new BigInteger("100")).toString()
		    .toCharArray();
		for (char aChar : theDigits)
			tally += Integer.parseInt(String.valueOf(aChar));
		System.out.println("Euler020 = " + tally + " - took "
		    + (System.currentTimeMillis() - startTime) + " millis");
	}
}
