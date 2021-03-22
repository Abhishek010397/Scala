/** Scala Maps
 * In Scala Map is a collection of key/value pairs where key are unique in the map*/


package ScalaDemo

object Demo15 {

  val myMap: Map[Int,String] = Map(801 -> "A",802 -> "B",803 -> "C")
  val myMap1: Map[Int,String] = Map(804 -> "D",805 -> "E",806 -> "F")
  def main(args: Array[String]){

    println(myMap)
    println(myMap(802))
    //Returns a set of Keys where all values are unique
    println(myMap.keys)
    println(myMap.values)
    println(myMap.isEmpty)

    //iterating Through Maps
    myMap.keys.foreach{ key =>
      println("key " + key)
      println("Value " + myMap(key))
    }

    //to check for a key
    println(myMap.contains(801))
    //can be used as an exception

    //concatenate 2 maps
    println(myMap.concat(myMap1))
  }


}
