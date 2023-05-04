package com.knoldus.learningscala


object ListWorking extends App{
  
  def listing(list1: List[Int], list2: List[Int]): List[Int] = {

    def bubbleSort(list: List[Int]): List[Int] = {

      def sorting(list: List[Int]): List[Int] = list match {
        case head :: headNext :: tail if (head > headNext) => headNext :: sorting(head :: tail)
        case head :: tail => head +: sorting(tail)
        case Nil => Nil
      }

      val sortedList = sorting(list)
      if(list == sortedList) sortedList
      else bubbleSort(sortedList)
    }

    def removeDuplicates(list: List[Int]): List[Int] = list match {
      case Nil => Nil
      case head :: tail if(tail.contains(head)) => removeDuplicates(tail)
      case head :: tail => head :: removeDuplicates(tail)
    }

    bubbleSort(removeDuplicates(list1 ::: list2))
  }

  val lista = List(1,2,2,3)
  val listb = List(3,4,2,5)

  println(listing(lista, listb))

}