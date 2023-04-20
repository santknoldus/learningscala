package com.knoldus.learningscala

import scala.collection.mutable.ListBuffer

class ReaderWriter {
  val sharedResource: ListBuffer[Int] = ListBuffer.empty[Int]
  var numReaders: Int = 0
  var isWriting: Boolean = false


  class Reader(id: Int) extends Runnable {
    override def run(): Unit = {
      while (true) {
        Thread.sleep(1000) // Sleep for 1 second
        acquireReadLock()
        println(s"Reader $id is reading: $sharedResource")
        releaseReadLock()
      }
    }
  }

  class Writer(id: Int) extends Runnable {
    override def run(): Unit = {
      while (true) {
        Thread.sleep(2000) // Sleep for 2 seconds
        acquireWriteLock()
        sharedResource += id
        println(s"Writer $id is writing: $sharedResource")
        releaseWriteLock()
      }
    }
  }

  def acquireReadLock(): Unit = synchronized {
    while (isWriting) {
      wait()
    }
    numReaders += 1
  }

  def releaseReadLock(): Unit = synchronized {
    numReaders -= 1
    if (numReaders == 0) {
      notify()
    }
  }

  def acquireWriteLock(): Unit = synchronized {
    while (isWriting || numReaders > 0) {
      wait()
    }
    isWriting = true
  }

  def releaseWriteLock(): Unit = synchronized {
    isWriting = false
    notifyAll()
  }
}
