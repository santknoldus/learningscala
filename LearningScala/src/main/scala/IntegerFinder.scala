package com.knoldus.learningscala

object IntegerFinder {

  def checkInt(string: String): Boolean = {
    var flag = 0
    for (index <- 0 until string.length) {
      if (string.charAt(index).isDigit) {
        return true
      }
    }
    false

  }

  def main(args: Array[String]): Unit = {
    val string: String = scala.io.StdIn.readLine()
    if(checkInt(string))
      println("true")
    else
    println("false")

  }
}
