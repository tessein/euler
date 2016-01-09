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
		final BigInteger numerator = factorial(gridSize.add(gridSize));
		final BigInteger denominator = (factorial(gridSize).pow(2));
		System.out.println("Euler015 = " + numerator.divide(denominator)
		    + " - finished in " + (System.currentTimeMillis() - startTime)
		    + " millis");
	}
	protected static BigInteger factorial(final BigInteger bi) {
		if (bi.compareTo(new BigInteger("2")) < 0)
			return BigInteger.ONE;
		else
			return bi.multiply(factorial(bi.subtract(BigInteger.ONE)));
	}
}
