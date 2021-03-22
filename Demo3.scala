package ScalaDemo

object Demo3 {
  def main(args: Array[String])
  {
    for ( i <- 1 to 5) {
      println(s"$i")
    }
    println("\n")
    for ( i <- 1.to(5)) {
      println(s"$i")
    }
    println("\n")
    for ( i <- 1.until(6)) {
      println(s"$i")
    }
    println("\n")
    //nested loop
    for ( i <- 1.until(6); j <- 1.to(3)) {
      println(s"$i and $j")
    }
    println("\n")

    //for loop to iterate over a list
    val list = List(1,2,3,4,5,6,7,8,9)
    for (i <- list){
      println(s"List $i")
    }
    println("\n")
    //Using Condition in Loops
    for( i <- list
         if i <= 3)
    {
      println(s"Filtered List $i")
    }
    println("\n")
    //Using For Loop as expressions
    val result = for {
      i <- list
      if i < 6
    }
      yield
      {
      i * i
    }
    println(s"Results is a square of List Elements = $result")


  }

}
