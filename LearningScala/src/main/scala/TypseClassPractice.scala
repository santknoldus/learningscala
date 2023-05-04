package com.knoldus.learningscala

trait Showing[A] {
  def show(a: A): String
}
object A extends App{
  implicit val intCanShow: Showing[Int] = new Showing[Int] {
    override def show(a: Int): String = s"int: $a"
  }
  println(intCanShow.show(2))
  //def show[Int](a: Int)(implicit showing: Showing[Int]) = showing.show(a)

  // we can use implicitly and rewrite it to:
  def show[Int: Showing](a: Int) = implicitly[Showing[Int]].show(a)
  println(show(2))
}
