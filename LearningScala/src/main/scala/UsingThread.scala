package com.knoldus.learningscala

class UsingThread extends Thread{

  override def run(): Unit ={
    for(index <- 0 to 3){
      println(index)
      Thread.sleep(3000)
    }
  }
  def task(): Unit = {
    for (index <- 12 to 14) {
      println(index)
      Thread.sleep(3000)
    }
  }
}

class Thread2 extends Thread{
  override def run(): Unit = {
    for (index <- 4 to 7) {
      println(index)
      Thread.sleep(3000)
    }
  }
}

class Thread3 extends Thread{
  override def run(): Unit = {
    for (index <- 8 to 11) {
      println(index)
      Thread.sleep(3000)
    }
  }
}