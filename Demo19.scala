/** Scala - Reduce, fold or scan (left/Right)
 * reduceLeft,reduceRight,foldLeft,foldRight,scanLeft,scanRight
 * Applied on collections and the result of each step is passed to the next step
 * Reduce Method takes an associative binary operator function as a parameter
 * */


package ScalaDemo

object Demo19 {

   var num = List(1,2,3,4,5,6)
   var str = List("A","B","C","D")
   def main(args: Array[String]){
     println(str.reduceLeft(_+_))//returns the addition of all elements in one "ABCD"
     //to get a sum of numbers present in the list
     println(num.reduceLeft(_+_))
     //A more explicit way of doing, the first 2 elements of the list is taken as param
     //then the result of first 2 along with third value for the next step
     //goes on until no value left in the lit and prints out result
     println(num.reduceLeft((x,y) => {
       println(x + " , "+ y)
       x+y
     }))
     //Reduce Right,Left for subtraction
     //Reduce Right takes the value from the right hand side of List
     println(num.reduceRight(_ - _))
     println("\n")
     //explicit method
     println(num.reduceRight((x,y) => {
       println(x + " , "+ y)
       x-y
     }))
     println("\n")

     println(num.reduceLeft(_ - _))

     //takes the start/initial value and args as binary operator, the result would be same as reduce left
     //with 0 added to the result
     println(num.foldLeft(0)(_ + _))
     println(num.foldLeft(100)(_ + _))//100+reduceLeft value
     //in Fold we can pas the extra element as the start value, & then apply binary operations on rest
     //list elements
     println(str.foldLeft("Z")(_ + _))

     //scan method, returns a List of intermediate result and the final result of addn of elements + initial value
     println(num.scanLeft(100)(_ + _))
     println(str.scanLeft("Z")(_+_))

   }

}
