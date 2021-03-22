/*Currying is the technique of transforming a function
that takes multiple arguments into a function
that takes a single argument
 */


package ScalaDemo

object Demo10 {
  def add(x:Int,y:Int)=x+y

  //Curried
  def add1(x:Int)= (y:Int)=> x+y
  def add2(x:Int)(y:Int)=x+y
  def main(args: Array[String]){
    println(add(20,10))

    println(add1(30)(10))
    val sum40 = add1(40)
    println(sum40(100))
    println(add2(40)(100))
    val sum50 = add2(55)_
    println(sum50(234))
  }

}
