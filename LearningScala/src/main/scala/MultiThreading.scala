package com.knoldus.learningscala

import java.util.concurrent.Executors
import scala.concurrent.Future

object MultiThreading extends App {

/*  val thread1 = new UsingThread
  val thread2 = new Thread2
  val thread3 = new Thread3
  thread1.start()
  thread1.join()
  thread1.task()
  thread2.start()
  thread1.join()
  thread3.start()
  println(thread3.getName)*/

  val usingRunnable = new UsingRunnable
/*    val usingRunnableInterface = new Thread(usingRunnable)
    usingRunnableInterface.setName("first thread")
    usingRunnableInterface.start()*/

  val executerService = Executors.newSingleThreadExecutor()
  executerService.execute(usingRunnable)

}