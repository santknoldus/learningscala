package com.knoldus.learningscala


object ListWorking extends App{
  

  val list  = List(11,22,33,44,55)
  list match {
    case first :: second :: third :: tail => println(third)
    case _ => throw new NoSuchElementException()
  }
  val updatedlist = list.drop(3)
  println(updatedlist)
}
