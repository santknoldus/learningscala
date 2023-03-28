package com.knoldus.learningscala

object Increment extends App {

  private def increment(number: Int, incrementBy: Int): Int = number + incrementBy

  val number = scala.io.StdIn.readInt()
  println(increment(number, 2))
}