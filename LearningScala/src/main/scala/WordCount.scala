package com.knoldus.learningscala

object WordCount extends App {

  def wordCount(string: String): Int = {
    string.split(" ").toList.length
  }

  val words = " He"
  println(wordCount(words))

}
