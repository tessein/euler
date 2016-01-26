tally = 0
def permutation(str) { 
  permutation("", str);
}

def permutation(prefix, str) {
    if (str.length() == 0) {
       if (((Integer.valueOf(prefix.substring(7,10)) % 17 == 0)) &&
          ((Integer.valueOf(prefix.substring(6,9)) % 13 == 0)) &&
          ((Integer.valueOf(prefix.substring(5,8)) % 11 == 0)) &&
          ((Integer.valueOf(prefix.substring(4,7)) % 7 == 0)) &&
          ((Integer.valueOf(prefix.substring(3,6)) % 5 == 0)) && 
          ((Integer.valueOf(prefix.substring(2,5)) % 3 == 0)) && 
          ((Integer.valueOf(prefix.substring(1,4)) % 2 == 0)))
         tally += Long.valueOf(prefix)
    }
    else
      for (short i = 0; i < str.length(); i++)
        permutation(prefix + str.charAt(i), 
                    str.substring(0, i) + str.substring(i + 1, str.length()));
}

permutation("1023456789") //smallest possible 1 to 9 pandigital number
println tally
