/** OOPs in Scala
 * Classes in Scala are the blueprint of creating Objects*/



package ScalaDemo

//A constructor class
class User(var name: String, var age: Int);


class User1(private var name: String,var age:Int){
  def printName{println(name)}
}
//Here Object is Singleton Class, which means we can't create an instance of the object
object Demo20 {

  def main(args: Array[String]){

    //creating an instance out of class User
    var user = new User("A",28)
    //user is an object here
    println(user.name)
    println(user.age)
    user.name = "B"
    user.age = 19
    println(user.name)
    println(user.age)
    var user1 = new User1("C", 29)
    user1.printName
    println(user1.age)


    //var -> getter and setter are available for the member variable e.g name  and age
    //val -> getter is only available as val is immutable
  }

}
