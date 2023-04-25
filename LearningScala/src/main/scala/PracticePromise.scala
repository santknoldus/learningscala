package com.knoldus.learningscala

import scala.concurrent.*
import scala.concurrent.ExecutionContext.Implicits.global
import scala.util.{Failure, Success}

object PracticePromise extends App {
  def getData(): Future[String] = {
    val promise = Promise[String]()
    // Perform some asynchronous operation to retrieve data
    // ...
//    if (operationSuccessful) {
//      promise.success(result)
//    } else {
//      promise.failure(new Exception("Failed to retrieve data"))
//    }
    promise.future
  }

  val dataPromise = getData()
  dataPromise.onComplete {
    case Success(data) => println(s"Data: $data")
    case Failure(error) => println(s"Error: ${error.getMessage}")
  }
}

/**
In this example, we create a Promise and use it to return a Future. We then perform some asynchronous
operation to retrieve data, and if the operation is successful, we use the success method of the Promise to
fulfill the promise with the retrieved data. If the operation fails, we use the failure method to reject the
promise with an error message.
We then return the Future associated with the Promise using the future method, which allows the client code
to register callbacks to handle the result of the asynchronous operation. In this case, we register a
callback using the onComplete method of the Future, which is called when the Future is fulfilled or rejected.
*/