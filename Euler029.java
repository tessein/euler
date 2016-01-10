import java.math.BigInteger;
import java.util.TreeSet;

/**
 * @author ctessein
 * 
 */
public class Euler029 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		final long startTime = System.currentTimeMillis();
		final BigInteger low = new BigInteger("2");
		final BigInteger high = new BigInteger("100");
		TreeSet<BigInteger> treeset = new TreeSet<BigInteger>();
		for (BigInteger base = low; base.compareTo(high) <= 0; base = base.add(BigInteger.ONE))
			for (int exponent = 2; exponent <= high.intValue(); exponent++)
				treeset.add(base.pow(exponent));
		System.out.println("Euler029 = " + treeset.size() + " - finished in "
		    + (System.currentTimeMillis() - startTime) + " millis.");
	}
}
