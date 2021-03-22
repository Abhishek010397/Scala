package ScalaDemo

object Demo6 {

  object Math {
    def add(x: Int = 10,y: Int = 10) = x+y

    def square(x:Int) = x*x

    //def *(x:Int,y:Int) = x-y
  }

  def print(x:Int,y:Int): Unit = {
    println(x+y)
  }

  def main(args: Array[String]){
    print(100,200)
    println(Math.add(100))
    println(Math.square(5))
    //println(math.*(4,4))
  }
}
