val value =2

class Hello(message : String){
  println(message)
}
new Hello("I! I am Sant")
//new Hello

val sum = 1 +
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

class Time(val hours :Int = 0 , val minutes : Int = 0){
  //TODO : Verify that hours is within 0 and 23
  //TODO : Verify that minutes is within 0 and 59
  val asMinutes = hours*60+minutes
  def minus(that:Time):Int = asMinutes-that.asMinutes
  def -(that:Time):Int = minus(that)
}

new Time()
res7.hours
val time  = new Time(10,12)
val time1 = new Time(1,1)
time.minus(time1)
time minus time1
time.-(time1)
time - time1

time.hours
time.minutes
time.asMinutes

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

