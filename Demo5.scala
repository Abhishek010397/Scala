package ScalaDemo

object Demo5 {
  //Function in Scala, 1st way
  def add(x : Int, y : Int) : Int = {
    return x+y
  }
  //2nd way
  def mult(x : Int, y : Int ) : Int = {
  x*y
  }

  //3rd way
  def subt(x : Int, y : Int) : Int = x-y

  //4th way
  def div(x : Int, y :Int) = x/y

  //5th way
  object Math{
    def add(x: Int, y: Int) = x+y
  }



  def main (args: Array[String]){
    println(add(45,10))
    println(subt(20,10))
    println(mult(10,10))
    println(div(10,5))
    println(Math.add(2,3))
  }

}
