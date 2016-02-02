long maxPandigital = 0;

for (int i=2;i < 10000; i++) {
  String pandigital = "";
  for (int j = 1; ; j++) {
    pandigital += i * j;
    if (pandigital.length() > 9) {
      break
    } else if (pandigital.length() == 9) {
      if ((pandigital.length() == 9) 
           && (Long.parseLong(pandigital) % 9 == 0)
           && (pandigital.matches("^(?!.*(.).*\\1)\\d{9}"))
           && (Long.valueOf(pandigital) > maxPandigital)) {
         maxPandigital = Long.valueOf(pandigital);
      }
      break
    }
  }
}
System.out.println("Maximum pandigital: " + maxPandigital);
