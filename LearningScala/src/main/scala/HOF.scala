package com.knoldus.learningscala

object HOF extends App{

  def hiherOrderFun(f: Int => Boolean, x: Int): Int => Int = {
    if(f(x))
    x => x/2
    else
      x => x
  }

  val isEven: Int => Boolean =  (x) => if(x%2 == 0) true else false

  val result = hiherOrderFun(isEven, 4)
}
