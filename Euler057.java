  import java.util.*;
  public class Euler039 {

   public static void main(String[] args) {
     int [] arr = new int[1000];
     for (int i = 1; i <= 1000; i++)
       arr[i-1] = i;
     HashSet<Long> squares = new HashSet<Long>();
     HashMap<Long,Long> map = new HashMap<Long,Long>();
     for (int num : arr)
       squares.add((long) num * num);
     for (int i = 0; i < arr.length - 1; ++i)
       for (int j = i + 1; j < arr.length; ++j) {
         long square = (long) arr[i] * arr[i] + (long) arr[j] * arr[j];
         if (squares.contains(square)) {
           long perim = (long)(arr[i]+arr[j]+Math.sqrt(square));
           if (perim <= 1000) {
             long count = map.containsKey(perim) ? map.get(perim) : 0;
             map.put(perim, count + 1);
           }
          System.out.println(arr[i] + "," + arr[j] + ","
             + (long) Math.sqrt(square) +":"+(long)(arr[i]+arr[j]+Math.sqrt(square))+"-"+map.get(perim));
         }
       }
     long maxKey = 0;
     long maxVal = 0;
     for(Map.Entry<Long, Long> entry : map.entrySet()){
       if (entry.getValue() > maxVal) {
         maxVal = entry.getValue();
         maxKey = entry.getKey();
       }
     }
     System.out.println(maxKey + ": " +maxVal);
  }
}
