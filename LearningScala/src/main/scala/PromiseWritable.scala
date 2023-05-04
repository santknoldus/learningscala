package com.knoldus.learningscala

import scala.concurrent.ExecutionContext.Implicits.global
import scala.concurrent.{Future, Promise}
import scala.util.{Success, Failure}

object PromiseWritable extends App {
  // Create a Promise
  val promise = Promise[Int]()

  // Get the associated Future
  val future = promise.future

  // Start a computation asynchronously
  val computation =  {
    // ... some long-running computation that produces a result ...
    promise.success(42)
    future
  }

  // When the computation is done, complete the Promise with its result
  computation.onComplete {
    case Success(result) => println(s"The result is $result")
    case Failure(ex) => println(s"The result is ${ex.getMessage}")
  }

  // Use the Future to get the result of the computation
  future.foreach { result =>
    println(s"The result is $result")
  }

  // We can't change the result of the Future, because it's read-only
  //future.success(123) // This would fail to compile

  // We can change the result of the Promise, because it's writable
  //promise.success(123)

  Thread.sleep(100)
}