package com.knoldus.learningscala

import scala.annotation.tailrec

object Factorial extends  App {

  def factorial(num: Int): Double = {

    @tailrec
    def helper(num: Int, res: Double): Double = {
      if(num == 0) res
      else helper(num - 1, res * num)
    }

    helper(num, 1)
  }

  println(factorial(2))

}
