package com.knoldus.learningscala

import scala.concurrent.ExecutionContext.Implicits.global
import scala.concurrent.Future

object PracticeF extends App {

  def longRunningComputation(x: Int): Int = {
    Thread.sleep(5000) // simulate a long computation
    x * 2
  }

  val futureResult: Future[Int] = Future {
    longRunningComputation(42)
  }.recoverWith {
    case ex => ex.getMessage
      Future.successful(0)
  }

  println("Doing some other work...")

  futureResult.onComplete {
    case scala.util.Success(result) => println(s"The result is $result")
    case scala.util.Failure(exception) => println(s"An error occurred: $exception")
  }

  println("Doing some more work...")


  val futureToFail = Future.failed(new Exception())

  val failedFuture = futureToFail.recover {
    case ex: Exception => ex.getMessage
  }
  println(failedFuture)
  Thread.sleep(10000)
}