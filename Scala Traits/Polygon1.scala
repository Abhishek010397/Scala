package ScalaDemo
//have multiple inheritance using Traits
trait shape {
  def shape: String
}
abstract class Polygon1 {
  def area: Double
}

object Polygon1{
  def main(args: Array[String]){
    var rect1 = new Rectangle1(45.00,89.65)
    printArea(rect1)
    println(rect1.shape )
    var tria1 = new Triangle1(78.00,56.32)
    printArea(tria1)
    println(tria1.shape)
  }

  def printArea(p1: Polygon1){
    println(p1.area)
  }

}