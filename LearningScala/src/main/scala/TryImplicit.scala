package com.knoldus.learningscala

object TryImplicit extends App{
  implicit val number: Int = 5

  def findSquare(implicit num: Int): Int = num * num

  println(findSquare)
}
