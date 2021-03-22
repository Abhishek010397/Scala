/**Scala Tuples
 * In Scala Tuples is a class that can contain different kind of elements,hetrogeneous datatypes
 * Tuples are immutable and have fixed size
 */


package ScalaDemo

object Demo16 {

  val mytupple = (1,2,3,"A","cat",true)
  //as we don't have any thing called "Tuple" so we provide the value of elements after "Tuple"
  val mytupple1 = new Tuple5(1,2,3,true, (2,3))
  def main(args: Array[String])
  {
    println(mytupple)
    //Printing the fourth element
    print(mytupple._4)
    println("\n")
    //Iterate over the tuple
    mytupple.productIterator.foreach{
      i => println(i)
    }

    //Second Way of creating a tuple, valid for only 2 elements e.g 1->"cat"->true can't be created
    println(1 -> "cat")

    //Fetching values from nested tuples
    println(mytupple1._5._2)
  }



}
