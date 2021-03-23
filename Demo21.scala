/** Getters And Setters
 *
 *                  Getter       Setter
 * val ->            yes           no
 * var ->            yes           no
 * default ->        no            no
 *
 * A class can have many auxiliary constructor but they should have diff. signature, they must
 * called the previously defined constructor
 * */


package ScalaDemo

//Private Constructor
class User2(private var name: String, age: Int){
  def printName{println(name)}
  def printAge{println(age)}
}
//Auxiliary Constructor -> Alternative constructor for a class
//Primary Constructor
class User3(var name: String,var age: Int){
  //Default Auxiliary Constructor
  def this() {
    this("A",32)
  }
  //Auxiliary Constructor With 1 Parameter
  def this(name:String){
    this(name, 9)
  }

}



object Demo21 {

  def main(args: Array[String]){

    //Instances of the Class
    var user2 =new User2("A",19)
    user2.printAge
    user2.printName
    var user3 = new User3("E",78)
    var user4 = new User3()
    var user5 = new User3("XYZ")
    println(user3.age)
    println(user3.name)
    println(user4.age)
    println(user4.name)
    println(user5.age)
    println(user5.name)

  }

}
