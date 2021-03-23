package ScalaDemo

abstract class Polygon {
  def area: Double //Abstract Method
  }

object Polygon{
  def main(args: Array[String]){
    var rect = new Rectangle(555.2,450.45)
    var tria = new Triangle(78,56)
    printArea(tria)
    printArea(rect)
  }

  def printArea(p: Polygon){
    println(p.area)
  }

}