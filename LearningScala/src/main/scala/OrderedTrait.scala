package com.knoldus.learningscala

trait Person extends Ordered[Person] {
  def name: String
  def age: Int

  def compare(that: Person): Int = {
    if (this.name == that.name) {
      this.age - that.age
    } else {
      this.name.compareTo(that.name)
    }
  }
}


case class Employee(name: String, age: Int) extends Person

object OrderedTrait extends App {
  val emp1 = Employee("John", 30)
  val emp2 = Employee("Jane", 25)

  println(emp1 > emp2) // true
  println(emp1 < emp2) // false
}