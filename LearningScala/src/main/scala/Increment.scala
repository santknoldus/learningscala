package com.knoldus.learningscala

object Increment extends App{

  def increment(number: Int): Int = number+1
  //val incrementedValue: Int => Int = integer => integer+1

  val number = scala.io.StdIn.readInt()
  //println(incrementedValue(number))
  println(increment(number))

}
