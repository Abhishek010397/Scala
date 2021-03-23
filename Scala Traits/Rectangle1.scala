package ScalaDemo

//how to have multiple inheritance at same time
class Rectangle1(var width:Double,var height:Double) extends Polygon1 with shape {
  override def area: Double = width * height
  //No need of override when using Traits
  def shape: String = "Rectangle Shape"

}
