/* A closure is a function which uses one or more varaibles declared
outside the function
 */

package ScalaDemo
import java.util.Date
object Demo9 {
  //impure closure as datatype is declared as var
  var num = 10
  val add = (x:Int) => {
    num = x+num
    num
  }
  //Pure Closure
  val num1 = 10
  val add1 = (x:Int)=> x+ num1


  def main(args: Array[String]){
    //closure takes the last valid state
    num = 100
    println(add(5))
    println(s"$num")
    println(s"$num1")
  }

}
