/**
 * @author ctessein
 * 
 */
public class Euler028 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		long startTime = System.currentTimeMillis();
		int curVal = 1;
		int diag1Total = 1;
		for (int i = 1; i <= 1000; i++) {
			curVal += (2 * i);
			diag1Total += curVal;
		}
		curVal = 1;
		int diag2Total = 0;
		for (int i = 1; i <= 500; i++) {
			curVal += (4 * i);
			diag2Total += curVal;
			curVal += (4 * i);
			diag2Total += curVal;
		}
		System.out.println("Euler028 = " + (diag1Total + diag2Total)
		    + " - finished in " + (System.currentTimeMillis() - startTime)
		    + " millis.");
	}
}
