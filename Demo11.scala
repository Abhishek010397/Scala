package ScalaDemo

object Demo11 {

  val num1 = 67
  val num2 = 87.89
  val str1: String = "AWS"
  val str2: String = " DevOps"
  def main(args: Array[String]){
    println(str1.length())
    println(str1.concat(str2))
    val res = printf("(%d -- %f -- %s)",num1,num2,str1)
    println(res)
    //This should be used in most cases
    println("(%d -- %f -- %s)".format(num1,num2,str1))


  }

}
