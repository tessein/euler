import java.util.Calendar;

/**
 * @author chuck
 * 
 */
public class Euler019 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		final long startTime = System.currentTimeMillis();
		int sunTotal = 0;
		for (int year = 1901; year <= 2000; year++) {
			for (int month = 0; month <= 11; month++) {
				final Calendar cal = Calendar.getInstance();
				cal.set(year, month, 1);
				if (cal.getTime().toString().startsWith("Sun"))
					sunTotal++;
			}
		}
		System.out.println("Euler019 = " + sunTotal + " - finished in "
		    + (System.currentTimeMillis() - startTime + " millis"));
	}
}
