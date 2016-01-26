import java.util.Arrays;

public class Euler052 {

  public static void main(String args[]) {

    for( int i = 1; i <= 10000000; i++) {
      char[] x1 = Integer.toString(i).toCharArray();
      Arrays.sort(x1);
      char[] x2 = Integer.toString(i * 2).toCharArray();
      Arrays.sort(x2);
      char[] x3 = Integer.toString(i * 3).toCharArray();
      Arrays.sort(x3);
      char[] x4 = Integer.toString(i * 4).toCharArray();
      Arrays.sort(x4);
      char[] x5 = Integer.toString(i * 5).toCharArray();
      Arrays.sort(x5);
      char[] x6 = Integer.toString(i * 6).toCharArray();
      Arrays.sort(x6);

      if (Arrays.equals(x2, x3) && Arrays.equals(x2, x4) && Arrays.equals(x2, x5) && Arrays.equals(x2, x6)) {
        System.out.println(i + ": Y");
        break;
      }
    }
  }
}
