package com.knoldus.learningscala

import scala.concurrent.Future
import scala.concurrent.ExecutionContext.Implicits.global

object PracticeF extends App {

  def longRunningComputation(x: Int): Int = {
    Thread.sleep(5000) // simulate a long computation
    x * 2
  }

  val futureResult: Future[Int] = Future {
    longRunningComputation(42)
  }.recoverWith{
    case ex => ex.getMessage
      Future.successful(0)
  }

  println("Doing some other work...")

  futureResult.onComplete {
    case scala.util.Success(result) => println(s"The result is $result")
    case scala.util.Failure(exception) => println(s"An error occurred: $exception")
  }

  println("Doing some more work...")

 // Thread.sleep(10000)
}