package ScalaDemo

object Demo7 {

  //Higher Order Function in Scala
  def math(x:Double,y:Double,z:Double,f:(Double,Double)=>Double): Double = f(f(x,y),z)

  def main(args: Array[String]){
    val result = math(50,20,30,(x,y)=>x+y)
    println(s"$result")
  }
}
