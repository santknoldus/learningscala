package com.knoldus.learningscala

object Options extends App {

  private def sum(num1: Option[Int], num2: Option[Int], num3: Option[Int]): Option[Int] = {
    num1.flatMap(number1 => num2.flatMap(number2 => num3.map(number3 => number3 + number2 + number1)))

    for {
      first <- num1
      second <- num2
      third <- num3
    } yield first+second+third

  }

  val result = sum(Some(3), Some(4), Some(5))
  println(result)


}