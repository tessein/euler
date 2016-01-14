def tree = new TreeSet()
(2..100).each {
  tens ->
    (100..(10000)).each {
      hundreds ->
        Set holder = new HashSet()
        product = tens * hundreds
        answer = tens.toString() + hundreds.toString() + product.toString()
        if (answer.length() <= 9)  {
          answer.each {
            if (!holder.add(it)) {
              return
            }
          }
          if (holder.size() == answer.length()) {
            print product.toString()
            println "     "+tens.toString()+":"+hundreds.toString()
            tree.add(product)
          }
        }
  }
}
println tree.sum()
