package ScalaDemo

object Demo {
  def main(args: Array[String])
  {
    val name = "Elon Musk"
    val age = 18.5
    println("Hello World!")
    println(name  + " is " + age + " years old") //+ here means concatenation!
    //1st way of String Interpolation
    println(s"$name is $age years old")// string Interpolation
    //2nd way of String Interpolation
    println(f"$name%s is $age%f years old")//f String Interpolation
    //3rd way of String Interpolation
    println(raw"Hello \nWorld")//raw String Interpolation, \ is not escaped
  }
}
