package com.knoldus.learningscala

import scala.concurrent.Future
import scala.concurrent.ExecutionContext.Implicits.global
import scala.concurrent.Await
import scala.concurrent.duration.*
import scala.util.{Failure, Success}

object PracticeFuture extends App{
  def longRunningComputation(x: Int): Int = {
    Thread.sleep(15000) // simulate a long computation
    x * 2
  }

  val futureResult: Future[Int] = Future{
    longRunningComputation(42)
  }

  println("Doing some other work...")

  val result = Await.result(futureResult, 20.seconds)
  println(s"The result is $futureResult")
  println("Doing some more work...")

  val futures = Seq(Future{1},Future{2},Future{3})
  val futureSeq = Future.sequence(futures)
  println(futureSeq)
  val pricesList: List[Future[Int]] = List(Future(1001), Future(999), Future(-2000), Future(1000))


  def getNameList(list: Future[List[info]]): Future[List[String]] = {
    list.map(listOfInfo => listOfInfo.map(ele => ele.toString))
  }
  case class info(name: String, age: Int)

  println(getNameList(Future(List(info("Name", 25)))))

  def listOfListOfListString(list: List[List[List[String]]]): List[Future[List[(String, Int)]]] = {
    for {
      listOfListOfString <- list
      listOfString <- listOfListOfString
      string <- listOfString
    } yield Future(List((string, string.length)))
  }

  listOfListOfListString(List(List(List("Tushar", "Steve", "Stark", "Bruce"))))


}