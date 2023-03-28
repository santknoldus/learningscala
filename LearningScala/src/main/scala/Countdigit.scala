package com.knoldus.learningscala

object Countdigit extends App{
  def countdigit(number: Int): Int = {
    if(number == 0) 1
    else {
      def helper(num: Int, digits: Int): Int = {
        if (num == 0)
          digits
        else helper(num / 10, digits + 1)
      }
      helper(number, 0)
    }

  }


  val num = 120
  println(countdigit(num))

}
