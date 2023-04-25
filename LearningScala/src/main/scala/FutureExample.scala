package com.knoldus.learningscala

import scala.concurrent.*
import scala.concurrent.ExecutionContext.Implicits.global
import scala.util.{Failure, Success}

object FutureExample extends App {

/*  def getData(): Future[String] = {
    // Perform some asynchronous operation to retrieve data
    // ...
    if (operationSuccessful) {
      Future.successful(result)
    } else {
      Future.failed(new Exception("Failed to retrieve data"))
    }
  }

  val dataFuture = getData()
  dataFuture.onComplete {
    case Success(data) => println(s"Data: $data")
    case Failure(error) => println(s"Error: ${error.getMessage}")
  }*/
}

/** In this example, we use a Future to handle the result of the asynchronous operation. If the operation is
successful, we use the successful method of the Future companion object to create a successful Future with 
the retrieved data. If the operation fails, we use the failed method to create a failed Future with an error 
message.
We then register a callback using the onComplete method of the Future, which is called when the Future 
is fulfilled or rejected. This allows us to handle the result of the asynchronous operation, whether it 
succeeds or fails. */