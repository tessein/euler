
public class Euler034 {

	public static void main (String[] arga) {
		int total = 0;
		for (int i = 3; i <= 100000; i++) {
			String raw = "" + i;
			char[] digits = raw.toCharArray();
		    int[] num = new int[raw.length()];
		    for (int j = 0; j < raw.length(); j++) 
		        num[j] = raw.charAt(j) - '0';
			int sum = 0;
			for (int j = 0;j < digits.length; j++) 
				sum += factorial(num[j]);
			if (sum == i) {
				total += sum;
				System.out.println(i + " : " + sum);
			}
		}
		System.out.println(total);
	}
	protected static long factorial(final long aLong) {
		if (aLong == 0)
			return 1;
		else
			return aLong * factorial(aLong-1);
	}
}
