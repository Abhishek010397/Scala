package ScalaDemo

object Demo2 {
  def main(args: Array[String])
  {
    var x = 0

    while (x < 10) {
      println(s" x = $x")
      x+=1 //x++ or x-- is not valid in Scala
    }
    var y = 0
    do {
      println(s"y = $y")
      y+=1
    } while(y < 10)
  }

}
