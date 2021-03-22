package ScalaDemo

object Demo1 {
  def main(args: Array[String])
  {
    val x = 20
    //variable used in if-else condition should not be a immutable one
    var res = ""
    if( x == 20){
      res = "x == 20"
    }
    else {
      res = "x != 20"
    }
    println(s"$res" )

    //We can store result to a variable directly using If Statement in Scala
    println( if (x != 20) "x == 20" else "x != 20")
  }

}
