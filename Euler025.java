import java.math.BigInteger;
import java.util.ArrayList;

/**
 * @author ctessein
 * 
 */
public class Euler025 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		final int maxLength = 1000;
		final long startTime = System.currentTimeMillis();
		final ArrayList<BigInteger> workList = new ArrayList<BigInteger>(2);
		workList.add(BigInteger.ZERO);
		workList.add(BigInteger.ONE);
		int counter = 0;
		while (true) {
			counter++;
			if (workList.get(1).toString().length() >= maxLength) {
				System.out.println("Euler025 = " + counter + " - finished in "
				    + (System.currentTimeMillis() - startTime) + " millis");
				break;
			}
			workList.add(workList.get(0).add(workList.get(1)));
			workList.remove(0);
		}
	}
}
