import java.math.BigInteger;

/**
 * @author chuck
 * 
 */
public class Euler016 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		final long startTime = System.currentTimeMillis();
		final char[] answer = new BigInteger("2").pow(1000).toString().toCharArray();
		int resultsum = 0;
		for (int i = 0; i < answer.length; i++)
			resultsum += Integer.parseInt(String.valueOf(answer[i]));
		System.out.println("Euler016 = " + resultsum + " - runtime was "
		    + (System.currentTimeMillis() - startTime) + " millis");
	}
}
