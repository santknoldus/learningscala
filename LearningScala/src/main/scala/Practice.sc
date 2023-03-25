import scala.collection.mutable.ListBuffer

val value =2

class Hello(message : String){
  println(message)
}
new Hello("I! I am Sant")
//new Hello

//val sum = 1 +
  2+
  3

class Message(message: String){
  def this() = this("Hello")
  println(message)
}
new Message
new Message("Hi!")

class MyName{
  val message : String = "Sant"
}

(new MyName).message

class Greet {
  var message : String = "Hello world"
}

val greet = new Greet
greet.message = "Hello World!"
(new Greet).message
greet.message

//class Car(brand : String)
//val car = new Car("Tata")
//car.brand

class Car(val brand : String)
val car = new Car("Tata")
car.brand





class Customer(val firstName: String)
val customer = new Customer("Johnny")

def Hello = "Hello"
Hello

def echo(message:String):String = message
echo("Hi i am Sant")

"Sant Singh".split(" ")

"Sant Singh" split " "

new String("Scala") == new String("Scala")

//def name(first:String,last:String):String = first + " " + last
//name("Sant","Singh")

def name(first:String = "",last:String = ""):String = first + " " + last
name("Sant")

object Something{
  def message  = "Hello!"
}
Something.message

object Messaging{
  private val defaultMessage:String= "hello!"
}
class Messaging(message : String = Messaging.defaultMessage){
  println(message)
}

require(1==2, "WEIRD")
//require(1==1, "WEIRD")

object Reverse {
  def apply(string : String) : String =
    string.reverse
}
Reverse("Hello")

val vector = Vector(1,2,3)
val seq = Seq(1,2,3)

for(number <- Vector(1,2,3)) yield number+1

val vec = Vector(1,2,3)
for(elem <- vec) yield ("hello" + 1.toString)

//val name = "Sant"
val age = 22
val message = s"My name is ${name} and I am ${age} years old."
println(message)

var name = (15, "Sant", true) //Tuple

val doubler: Int => Int = (number: Int) => number*2
doubler(2)

val tripler: Int => Int = number => number*4
tripler(3)

val anonymousFun = (age: Int, name: String) => {
  if(age>18){
    println(s"$name is eligible for voting")
  }
  else
    println(s"$name is under age")
}
anonymousFun(22,"Sant")

val number = (num1: Int, num2: Int) => num1+num2+"abc"
number(1,2)
println(number)

class Class{
   override def +(value: Int):Int = value + value
}
val first = new Class
println(first.+(4))
println(+(2))

val integer = 1
println(s"sant\ntushar")
println(raw"sant\ntushar")
println(f"sant\ntushar")

println(s"$integer\nsant")

val string = "Sant\ntushar"
println(raw"$string")
println()

val person = """{"name"}"""
println(person)

val person2 = """name"""
println(person)
println(s"${1+1} ${1+2}")
println(s"${"name"}")

val height = 1
println(f"$height%5.2f")
println(f"$height%.2f")

val counter: (Int, Int) => Int = (value1, value2) => value1 + value2
val curriedCounter: Int => Int => Int = value1 => value2 => value1 + value2
counter(1,2) == 3
curriedCounter(1)(2) == 3

def somFun(n: Int)(implicit abc: Int) = ???
//implicit val abc = 2
somFun(3)

val aNumber = 3
val matching: String = aNumber match{
  case 1 => "first"
  case 2 => "second"
  case _ => "kuch bhi"
}
matching

class DavidBanner

trait Angry {
  println("You won't like me ...")
}
object Test extends App {
  val hulk = new DavidBanner with Angry
  println(hulk)
}

val list = List(1,2,3)
val newlist = list.updated(1,4)
println(newlist)
println(list)

val listOfOption = List(Some("Tushar"),None,Some("Sant"))
def tryOption(values: List[Option[String]]):List[String] = {
  //values.map(value => value.map( value => value.toUpperCase())).flatten
  values.flatMap(value => value.map(value => value.toUpperCase()))
}



println(tryOption(listOfOption))

val optionOfList = Some(List("sant"))
def tryListOption(values: Option[List[String]]): Option[String] = {
  values.flatMap(value => value.map(names => names))
}

implicit val firstName: String= "Info"
implicit val LastName: Int= 1
def log(implicit firstName: String,lastName: Int) = println(s"$firstName $lastName")
log
