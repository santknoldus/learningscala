package com.knoldus.learningscala
package SumOfList

import scala.annotation.tailrec

class SumOfList {

  // to sum all the element of list
  def sumOfList(list: List[Int]): Int = {
    @tailrec
    def helper(list: List[Int], sum: Int): Int = list match {
      case Nil => sum
      case ::(head, tail) => helper(tail, sum + head)
    }

    helper(list, 0)
  }
}