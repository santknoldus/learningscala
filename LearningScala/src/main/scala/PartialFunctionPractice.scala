package com.knoldus.learningscala

object PartialFunctionPractice extends App{

  //It is a Trait, which needs two methods namely isDefinedAt and apply to be implemented.

  val partialFunction = new PartialFunction[Int, Int] {

    // Applying isDefinedAt method
    def isDefinedAt(num: Int): Boolean = num != 0

    // Applying apply method
    def apply(num: Int): Int = 42 / num

  }

  println(partialFunction.isDefinedAt(2))

  val partialFunctionUsingCase: PartialFunction[Int, Int] = {

    // using case statement
    case num if (num % 2) == 0 => num / 2
  }

  println(partialFunctionUsingCase(3))


  val divide = new PartialFunction[Int, String] {
    override def isDefinedAt(x: Int): Boolean = x != 0

    override def apply(num: Int): String = if(isDefinedAt(num)) "Correct" else "Incorrect"
  }

  println(divide(0))

}