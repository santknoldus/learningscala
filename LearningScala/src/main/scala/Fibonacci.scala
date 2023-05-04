package com.knoldus.learningscala

object Fibonacci extends App {

  def generateFibonacci(limit: Int): List[Int] = {
    def helper(first: Int, second: Int, limit: Int): List[Int] = {
      if(limit == 0) Nil
      else {
        first :: helper(second, first+second, limit - 1)
      }
    }

    helper(0,1,limit)
  }

  println(generateFibonacci(10))
}