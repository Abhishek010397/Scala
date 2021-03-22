package ScalaDemo

object Demo13 {

  val myList: List[Int] = List(1,2,3,4)
  val MyList: List[String] = List("A","B","C")




  def main(args: Array[String])
  {
    //appending elements at the start
    println(0 :: myList)
    println(MyList)
    println(1:: 5:: 7:: 9:: Nil)
    println(myList.head)
    println(MyList.tail)
    println(List.fill(5)(1))
    myList.foreach(println)
    var sum: Int = 0;
    myList.foreach(sum += _)
    println(sum);
    for(alpha <- MyList){
      println(alpha)
    }
  }
}