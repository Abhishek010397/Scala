/* Scala Map And Filter
Map method is used to iterate over a collection, can be a list,array or a set
Apply a function to each element of the collection
 */

package ScalaDemo

object Demo18 {

  val list = List(1,2,3,4,5,6,7)
  //1->"A" is a tuple, so every element(key/value) in a map is tuple
  val myMap = Map(1->"A",2->"B",3->"C")
  def main(args: Array[String])
  {
     //Let say we apply a map method to a list
    println(list.map(_* 2))//double every element of a list and give us a "new list" with double num
    println("\n")
    //Another way which is more specific
    println(list.map(x => x*2))
    println("\n")
    //for adding
    println(list.map(_+2))//or x=>x+2, all arithmatic operation can be performed
    println("\n")
    println(list.map("hi"+_))//x=>"hi+x"
    //Let's get hi printed according to number present in the list
    println(list.map("hi"*_))
    //Appending a string to every element in the map
    println(myMap.map(x => "hi" + x))
    //If we want to append some string to the values of the map
    //This is deprecated
    println(myMap.view.mapValues(x => "hi" +x ))
    //String Manipulation with Map function, the map will iterate over element of the string and
    //apply toUpper to each element
    println("Hello".map(_.toUpper))
    //flatten method to a list of list, flatten combines both the list
    println(List(List(1,2,3,4),List(5,6,7,8)).flatten)
    //flatMap method -> which acts as a shorthand to  map and then flattens it
    println(list.flatMap(x => List(x,x+1)))//returns the list along with +1 on each element of the list
    //to get a list of list with +1 on each element
    println(list.map(x => List(x,x+1)))
    //filter method, uses a predicate which uses boolean value, provided as an argument to this filter
    println(list.filter(x => x%2 == 0))// returns all even elements from the list

  }

}
