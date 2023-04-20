import scala.annotation.{tailrec, targetName}
import scala.collection.mutable.ListBuffer

val value = 2

class Hello(message: String) {
  println(message)
}

new Hello("I! I am Sant")
//new Hello

//val sum = 1 +
2 +
  3

class Message(message: String) {
  def this() = this("Hello")

  println(message)
}

new Message
new Message("Hi!")

class MyName {
  val message: String = "Sant"
}

(new MyName).message

class Greet {
  var message: String = "Hello world"
}

val greet = new Greet
greet.message = "Hello World!"
(new Greet).message
greet.message

//class Car(brand : String)
//val car = new Car("Tata")
//car.brand

class Car(val brand: String)

val car = new Car("Tata")
car.brand


class Customer(val firstName: String)

val customer = new Customer("Johnny")

def Hello = "Hello"
Hello

def echo(message: String): String = message
echo("Hi i am Sant")

"Sant Singh".split(" ")

"Sant Singh" split " "

new String("Scala") == new String("Scala")

//def name(first:String,last:String):String = first + " " + last
//name("Sant","Singh")

def name(first: String = "", last: String = ""): String = first + " " + last
name("Sant")

object Something {
  def message = "Hello!"
}

Something.message

object Messaging {
  private val defaultMessage: String = "hello!"
}

class Messaging(message: String = Messaging.defaultMessage) {
  println(message)
}

require(1 == 2, "WEIRD")
//require(1==1, "WEIRD")

object Reverse {
  def apply(string: String): String =
    string.reverse
}

Reverse("Hello")

val vector = Vector(1, 2, 3)
val seq = Seq(1, 2, 3)

for (number <- Vector(1, 2, 3)) yield number + 1

val vec = Vector(1, 2, 3)
for (elem <- vec) yield ("hello" + 1.toString)

//val name = "Sant"
val age = 22
val message = s"My name is ${name} and I am ${age} years old."
println(message)

var name = (15, "Sant", true) //Tuple

val doubler: Int => Int = (number: Int) => number * 2
doubler(2)

val tripler: Int => Int = number => number * 4
tripler(3)

val anonymousFun = (age: Int, name: String) => {
  if (age > 18) {
    println(s"$name is eligible for voting")
  }
  else
    println(s"$name is under age")
}
anonymousFun(22, "Sant")

val number = (num1: Int, num2: Int) => num1 + num2 + "abc"
number(1, 2)
println(number)

class Class {
  def +(value: Int): Int = value + value
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
println(s"${1 + 1} ${1 + 2}")
println(s"${"name"}")

val height = 1
println(f"$height%5.2f")
println(f"$height%.2f")

val counter: (Int, Int) => Int = (value1, value2) => value1 + value2
val curriedCounter: Int => Int => Int = value1 => value2 => value1 + value2
counter(1, 2) == 3
curriedCounter(1)(2) == 3

def somFun(n: Int)(implicit abc: Int) = ???
//implicit val abc = 2
somFun(3)

val aNumber = 3
val matching: String = aNumber match {
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

val list = List(1, 2, 3)
val newlist = list.updated(1, 4)
println(newlist)
println(list)

val listOfOption = List(Some("Tushar"), None, Some("Sant"))
def tryOption(values: List[Option[String]]): List[String] = {
  //values.map(value => value.map( value => value.toUpperCase())).flatten
  values.flatMap(value => value.map(value => value.toUpperCase()))
}


println(tryOption(listOfOption))

val optionOfList = Some(List("sant"))
//def tryListOption(values: Option[List[String]]): Option[String] = {
//  values.flatMap(value => value.map(names => names))
//}

implicit val firstName: String = "Info"
implicit val LastName: Int = 1
def log(implicit firstName: String, lastName: Int) = println(s"$firstName $lastName")
log


val list2 = List(1, 1, 2, 3, 5, 8)
println(list2.last)
@tailrec
def findinglast(list: List[Int]): Int = list match {
  case head :: Nil => head
  case _ :: tail => findinglast(tail)
  case _ => throw new NoSuchElementException()
}
println(findinglast(list2))

@tailrec
def findingsecondlast(list: List[Int]): Int = list match {
  case first :: _ :: Nil => first
  case _ :: tail => findingsecondlast(tail)
  case _ => throw new NoSuchElementException()
}
println(findingsecondlast(list2))

//def findKthelement(list: List[Int]): Int = list match {
//  case
//}

val url = "https://www.mywebsite.com/home"
println(url.indexOf("://"))
println(url.substring(url.indexOf("://") + 3, url.indexOf("/", url.indexOf("://") + 3)))

//val numList = List(1,2,3,4,5)
//val sumresult = for {
//  num <- numList
//  sum: Int = sum + num
//} yield sum
//
//println(sumresult)

val numbers = List(1, 2, 3)
val characters = List('a', 'b', 'c')
val combinations = numbers.flatMap(number => characters.map(char => "" + char + number))
println(combinations)

val list3 = List('a', 'b', 'c')
val list4 = List(1, 2, 3)
val list5 = List('a', 'b', 'c')
val list6 = List(1, 2, 3)

val string1 = "abc"
val string2 = "abc"

2 eq 3

println("==")
println(list3 == list5)
println(list3 == list4)
println("equals")
list4 equals (list6)
list4 equals list5
println("eq")
list3 eq list5
list4 eq list5
string1 eq string2
println(string1.getClass)


val string4 = new String("1")
val string5 = new String("1")
string4 eq string5

val list8 = List(1, 2, 3)
val list7 = List(2, 1, 3)
println(list8 == list7)

def operation(fun: (Int, Int) => Int, operand1: Int, operand2: Int): Double = {
  fun(operand1, operand2)
}

val num1 = 12
val num2 = 12

println(operation((num1, num2) => num1 + num2, num1, num2))

val someFun: Int => Int = x => 42 / x
val divide = (x: Int) => 42 / x
println(divide(7))
println(someFun(7))

val againDivide = new PartialFunction[Int,Int] {
  def apply(x: Int) = 42 /x
  override def isDefinedAt(x: Int): Boolean = x != 0
}

println(againDivide.isDefinedAt(1))

val convertLowNumToString = new PartialFunction[Int, String] {
  val nums = Array("one", "two", "three", "four", "five")
  def apply(i: Int) = nums(i-1)
  def isDefinedAt(i: Int) = i > 0 && i < 6
}

trait A
trait B

new A {}
new A with B

def reverse(word: String): String = {
  (for(index <- word.length-1 to 0 by -1) yield word(index)).mkString
}
println(reverse("abc"))

val phoneBook = Map(("Jim", 500),("Sant",400))
phoneBook.map(pair => pair._1.toLowerCase() -> pair._2)
phoneBook.view.filterKeys(x => x.startsWith("J")).toMap
//
def friend(network: Map[String, Set[String]],a: String,b: String): Map[String, Set[String]] = {
  val friendsA = network(a)
  val friendsB = network(b)

  network + (a -> (friendsA + b)) + (b -> (friendsB + a))
}

val network: Map[String, Set[String]] = Map(("Sant",Set("aa","bb")),("Tushar",Set("gg","ff")))

friend(network,"Sant", "Tushar")

network.updated("Sant",Set())

val listOfTuple = List((1,2),("s",1))

val iter = Iterator(2, 4, 5, 1, 13)
iter.find(x => {x % 2 != 0})

val newList = List(1,2,6,4,6)
newList.indexOf(newList.max)

val names = List("sant","tushar")
val otherNames = List("akhil")
for {name <- names
     name2 <- otherNames
     }yield name + name2

val myTuple = (1,"sss",3.22,true)
myTuple._3

network.get("Sant")

val numbersList = List(1,2,3,4,5)
val chars = List("a","b")
numbersList.flatMap(num => chars.map(char => char + num))

val double = 2.3
double == double.toInt

def execute(caseClass: CaseClass): Seq[Double] = {
  @tailrec
  def fibonacci(number: Double,first: Double = 0, second: Double = 1, list: Seq[Double]): Seq[Double] = {
    if (number == 0) list
    else fibonacci(number-1, second, second+first, list :+ first)
  }

  fibonacci(caseClass.operands.head,0,1,Seq(1,2))
}

try{
  execute(CaseClass(Seq(10)))
} catch {
  case exception => exception.printStackTrace()

}
case class CaseClass(operands: Seq[Double])

enum Color:
  case Red, Green, Blue
val x = Color.Red

/*enum Colors(val rgb: Int):
  case Red extends Colors(0)
  case Blue extends Colors(1)*/

val immutableList = List(1,2)
val immutableList2 = List(3,4)
val listOfList = List() :+ immutableList :+ immutableList2

def stringConcat(string1: String, string2: String): String = {
  string1 + string2
}
val result = stringConcat(_, "Singh")
println(result("Sant"))

case class Human(name: String, age: Int)

Human("Tushar",23) match {
  case human  => if(human.age>25)println("Valid")
}

class Person(){}
object Person{
  def apply(name: String) = name
  def apply(name: String, age: Int) = println(name + " " + age)
}
val person3 = Person("Tushar")
Person("SAnt", 25)

val nums = (1 to 5).toList
nums.sliding(2).toList

def duplicate[A](element: A, times: Int): List[A] = {
  if (times <= 0) {
    List.empty
  } else {
    element :: duplicate(element, times - 1)
  }
}

val someList: List[List[List[Int]]] = List(List(List(1)))

val someList2 = someList.flatMap(element => element).flatten

