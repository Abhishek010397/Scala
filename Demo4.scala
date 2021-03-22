package ScalaDemo

object Demo4 {
  def main(args: Array[String])
  {
    //Match Expressions
    val age = "20"
    age match {
      case "20" => println(s"$age")
      case "18" => println(s"$age")
      case "40" => println(s"$age")
      case "25" => println(s"$age")
      //Default case
      case _ => println("default")
    }

    val result = age match {
      case "20" => age
      case "18" => age
      case "40" => age
      case "25" => age
      //Default case
      case _ => "default"
    }
    println(s"Age is $result")

    val i = 7
    i match {
      case 1 | 3 | 5 | 7 | 9 => println("ODD")
      case 2 | 4 | 6 | 8 | 10 => println("EVEN")
    }

  }

}
