public class Euler026 {
  public static void main (String[] args) {
    final long startTime = System.currentTimeMillis();
    int result = 0;
    int franctionalPartLength = 0;
    for (int i = 1000; i > 1; i--) {
        if (franctionalPartLength >= i) { 
          result = i;
          break;
        }
        int[] numRemainders = new int[i];
        int value = 1;
        int position = 0;
        while (numRemainders[value] == 0 && value != 0) {
            numRemainders[value] = position;
            value *= 10;
            value %= i;
            position++;
        }
        if (position - numRemainders[value] > franctionalPartLength) {
            franctionalPartLength = position - numRemainders[value];
           if (i - franctionalPartLength == 1)
              System.out.println(i + ": " + franctionalPartLength);
        }
    }
    System.out.println("Euler001 = " + result + " finished in "
        + (System.currentTimeMillis() - startTime) + " millis");
  }
}
