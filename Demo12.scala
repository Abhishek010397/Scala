package ScalaDemo
import Array._
object Demo12 {

  var myarray2 = Array(1,2,3,4)
  var myarray: Array[Int] = new Array[Int](3)
  var myarray1 = new Array[Int](4)
  def main(args: Array[String]){
    //Assigning Element to Scala Array
    myarray(0) = 20
    myarray(1) = 21
    myarray(2) = 22
    //one way to iterate over scala arrays
    for(i <- myarray){
      println(i)
    }
    println("\n")
    //2nd way
    for(i <- 0 to (myarray.length - 1)) {
      println(myarray(i))
    }
    println("\n")
    println(myarray2.length)
    println("\n")
    val res=concat(myarray,myarray2)
    for(i <- res){
      println(i)
    }


  }

}
