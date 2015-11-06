import java.math.BigInteger;

/**
 * @author chuck
 * 
 */
public class Euler015 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		final long startTime = System.currentTimeMillis();
		final BigInteger gridSize = new BigInteger("20");
		final BigInteger numerator = Utility.factorial(gridSize.add(gridSize));
		final BigInteger denominator = (Utility.factorial(gridSize).pow(2));
		System.out.println("Euler015 = " + numerator.divide(denominator)
		    + " - finished in " + (System.currentTimeMillis() - startTime)
		    + " millis");
	}
}
