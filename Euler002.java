/**
 * @author chuck
 * 
 */
public class Euler002 {

	/**
	 * @param args
	 *          - not used
	 */
	public static void main(String[] args) {
		final long startTime = System.currentTimeMillis();
		final int MAX = 4000000;
		int firstFibNum = 1;
		int secondFibNum = 1;
		int sum = 0;
		while (!(secondFibNum >= MAX)) {
			int temp = secondFibNum;
			secondFibNum += firstFibNum;
			firstFibNum = temp;
			if (firstFibNum % 2 == 0)
				sum += firstFibNum;
		}
		System.out.println("Euler002 = " + sum + " finished in "
		    + (System.currentTimeMillis() - startTime) + " millis");
	}
}
