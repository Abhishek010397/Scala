package ScalaDemo

class Triangle1(var width:Double,var height:Double) extends Polygon1 with shape {
  override def area: Double = (width * height)/2
  //No need of override when using Traits
  def shape: String = "Triangle Shape"

}
