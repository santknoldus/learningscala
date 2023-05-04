package com.knoldus.learningscala

import scala.annotation.tailrec

object Sorting extends App{

  @tailrec
  def bubbleSort(list: List[Int]): List[Int] = {
    def sort(list: List[Int]): List[Int] = list match {
      case head :: headNext :: restElement if head > headNext => headNext :: sort(head :: restElement)
      case head :: restElement => head :: sort(restElement)
      case Nil => Nil
    }

    val sortedList: List[Int] = sort(list)
    if (sortedList == list) sortedList
    else bubbleSort(sortedList)
  }

  val list1 = List(4, 3, 2, 1)
  println(bubbleSort(list1))

}
