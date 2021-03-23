/** Scala Lazy Evaluation
 * A lazy evaluation is an evaluation strategy which delays the evaluation of
 * an expression until its value is needed*/


package ScalaDemo

class strict{
  val e = {
    println("strict\n")
    8
  }
}

class lazyEval {
  lazy val l = {
  println("Lazy\n")
  9
}
}



object Demo22 {

  def method1(n: Int){
    println("method1")
    println(n)
  }

  //Lazy Evaluation Method
  def method2(n: => Int){
    println("Method2")
    println(n)
  }


  def main(args: Array[String]){

    val x = new strict
    val y = new lazyEval //Not be printed on the go as its lazy

    val add = (a: Int,b:Int) => {
      println("Add")
      a+b
    }



    println(x.e)
    println(y.l)//value will be printed here


    method1(add(5,6))
    method2(add(9,5))
  }

}
