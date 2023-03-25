package com.knoldus.learningscala



abstract class Student[-T]
{
  def name: T
}

case class Girls[T](name: T) extends Student[-T]

case class Boys[T](name: T) extends Student[T]

object Covariance extends App {
  def Studentnames(students: List[Boys[String]]): Unit = {
    students.foreach { student =>
      println(student.name)
    }
  }

  val boys: List[Student[String]] = List(Boys("Kanchan"), Boys("Rahul"))
  val girls: List[Girls[String]] = List(Girls("Nidhi"), Girls("Geeta"))

  Studentnames(boys)
  Studentnames(girls)
}

