package com.knoldus.learningscala

object Palindrome extends App {

  def isStringPalindrome(string: String): Boolean = {

    def reverseString(input: String): String = input.toList match {
      case Nil => ""
      case ::(head, next) => reverseString(next.mkString) + head
    }

    if (string == reverseString(string)) true
    else false
  }

  def isListPalindrome[A](list: List[A]): Boolean = {

    def reverseList(list: List[A]): List[A] = list match {
      case Nil => Nil
      case head :: tail => reverseList(tail) :+ head
    }

    if (list == reverseList(list)) true
    else false
  }

  def isNumberPalindrome[B](number: BigInt): Boolean = {

    def reverseNumber(number: BigInt, reversed: BigInt = 0): BigInt = {
      if (number > 0) {
        reverseNumber(number / 10, (reversed + (number % 10)) * 10)
      }
      else reversed / 10
    }

    if (number == reverseNumber(number)) true
    else false
  }
  
  println(isStringPalindrome("aba"))
  println(isListPalindrome(List(1, 2, 1)))
  println(isNumberPalindrome(121))

}
