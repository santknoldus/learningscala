package com.knoldus.learningscala

import Objects.Person.personName

object Objects extends  App {

  object Person{
    var personName = "Sant"
    def eat(string: String) : String = s"$string is eating"
    def apply(he: Person, she: Person): Person = new Person("Tushar")
  }

  println(Person.eat(Person.personName))

  class Person(val name: String) {
    personName = "Anish"
    def printingName(): Unit  = println(Person.eat(Person.personName))
  }
  val rishabh = new Person("Rishabh")
  val tanya  = new Person("Tanya")
  val tushar = Person.apply(rishabh,tanya)
  val shivam = Person(rishabh,tanya)
}
