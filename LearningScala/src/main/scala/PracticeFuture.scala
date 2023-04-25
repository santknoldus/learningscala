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
}