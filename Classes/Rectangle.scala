package ScalaDemo

class Rectangle(var width: Double, var height: Double) extends Polygon {
  //overridinf the area method from polygon clas
  override def area : Double = width * height


}
