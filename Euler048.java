import java.math.BigInteger;

/**
 * @author chuck
 * 
 */
public class Euler048 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		final long startTime = System.currentTimeMillis();
		BigInteger tot = BigInteger.ZERO;
		for (int i = 1; i <= 1000; i++)
			tot = tot.add(new BigInteger(String.valueOf(i)).pow(i));
		System.out.println("Euler048 = "
		    + (tot.toString().substring(tot.toString().length() - 10))
		    + " - finished in " + (System.currentTimeMillis() - startTime)
		    + " millis");
	}
}
