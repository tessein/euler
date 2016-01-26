def StringBuilder fractional = new StringBuilder('1')

(2..200000).each { // 200,000 is a SWAG for concatenations
  if (fractional.length() >= 1000000)
    return
  else
    fractional.append(it)
}

println ((Integer.valueOf(String.valueOf(fractional.charAt(0)))) * 
         (Integer.valueOf(String.valueOf(fractional.charAt(9)))) *
         (Integer.valueOf(String.valueOf(fractional.charAt(99)))) *
         (Integer.valueOf(String.valueOf(fractional.charAt(999)))) *
         (Integer.valueOf(String.valueOf(fractional.charAt(9999)))) *
         (Integer.valueOf(String.valueOf(fractional.charAt(99999)))) *
         (Integer.valueOf(String.valueOf(fractional.charAt(999999)))));
