package com.knoldus.learningscala
package SumOfList

object SumOfListApp extends App {

  val sumOfList = new SumOfList

  val list = List(10, 20, 30, 40)
  private val sum = sumOfList.sumOfList(list)

  println(sum)
}