/* Scala Sets
In Scala sets are defined as collections of different elements of same data type
A set cannot have duplicate values inside them
 */


package ScalaDemo

object Demo14 {
  val myset: Set[Int] = Set(1,2,3,4,5,3)
  //to declare a set as mutable
  var  myset1: scala.collection.mutable.Set[Int] = scala.collection.mutable.Set(1,2,3,4,5,6,4)
  val names: Set[String] = Set("A","B","C")
  def main(args: Array[String]){
    println(myset)
    println(myset1+10)
    println(myset1)
    // for checking a value in the set
    println(myset(5))
    //Concatenate 2 sets
    println(myset.++(myset1))
    //Intersection of 2 sets
    println(myset.&(myset1))
    //One More Way
    println(myset.intersect(myset1))
    //Iterating over Sets
    myset.foreach(println)
    for( i <- myset1){
      println(i)
    }
  }

}