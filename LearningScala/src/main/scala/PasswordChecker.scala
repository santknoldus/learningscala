package com.knoldus.learningscala

object PasswordChecker extends App {

  def hasPunctuation(string: String): Boolean =
    string.exists(char =>
    char == '.' ||
    char == ',' ||
    char == ';' ||
    char == ':' ||
    char == '?' ||
    char == '!' ||
    char == '"' ||
    char == '_' ||
    char == '(' ||
    char == ')'
    )


  def isValidPassword(password: String): Boolean = {
    password.length >= 8 &&
      password.exists(_.isUpper) &&
      password.exists(_.isLower) &&
      password.exists(_.isDigit) || hasPunctuation(password)
  }

  val password: String = "ScalaChallenge2"
  println(isValidPassword(password))  //true
}
