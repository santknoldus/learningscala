package com.knoldus.learningscala

import scala.util.{Success, Try}

object ForExpTry extends App {

  val num1 = Try(10/0)
  val num2 = Try(3.2)
  val num3 = Try(4.5)
  val num4 = Try(6.7)

  val result: Try[Double] = for {
    first <- num1
    second <- num2
    third <- num3
    fourth <- num4
  } yield first - second + third - fourth

  println(result)
}