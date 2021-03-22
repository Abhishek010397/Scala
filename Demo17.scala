/** Scala Option Types
 * In scala options are containers which can give us two values
 * Returns Some or None */





package ScalaDemo

object Demo17 {

  val list= List(1,2,3)
  val map = Map(1-> "T", 2 -> "S", 3 -> "Q")
  val opt: Option[Int] = None
  def main(args: Array[String]){
    println(list.find(_ > 2))
    //To get the value not with Some(value) but the value
    println(list.find(_ > 2).get)
    //If List doesn't consists the exact Value, Used to not get an Exception
    println(list.find(_ > 2).getOrElse("Nothing"))
    println(map.get(2))
    //If Map doesn't consists the exact Key's Value, Used to not get an Exception
    println(map.get(5).getOrElse("Nothing"))

    println(opt.isEmpty)
  }

}
