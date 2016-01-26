tally = 0
def permutation(str) { 
  permutation("", str);
}

def permutation(prefix, str) {
    int n = str.length();
    if (n == 0 && prefix.getAt(0) != '0') {
       int twos = Integer.valueOf(prefix.substring(1,4))
       int threes = Integer.valueOf(prefix.substring(2,5))
       int fives = Integer.valueOf(prefix.substring(3,6))
       int sevens = Integer.valueOf(prefix.substring(4,7))
       int elevens = Integer.valueOf(prefix.substring(5,8))
       int thirteens = Integer.valueOf(prefix.substring(6,9))
       int seventeens = Integer.valueOf(prefix.substring(7,10))
       if ((twos % 2 == 0) && (threes % 3 == 0) && (fives % 5 == 0) && (sevens % 7 == 0)
         && (elevens % 11 == 0) && (thirteens % 13 == 0) && (seventeens % 17 == 0)) {
         tally += Long.valueOf(prefix)
       }
    }
    else {
        for (int i = 0; i < n; i++)
            permutation(prefix + str.charAt(i), str.substring(0, i) + str.substring(i+1, n));
    }
}

permutation("1023456789")
println tally
