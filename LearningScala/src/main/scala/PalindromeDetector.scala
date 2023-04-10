package com.knoldus.learningscala

object PalindromeDetector extends App {

  def palindromeDetector(word: String): Boolean = {
    var reversedString = ""
    word.foreach(character => reversedString  = character + reversedString)
    if(reversedString == word) true
    else false
  }
  val string = "aba"
  println(palindromeDetector(string))
}

