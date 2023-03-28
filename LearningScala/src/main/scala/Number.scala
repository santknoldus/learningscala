package com.knoldus.learningscala

case class Number(string: String, isEven: Boolean)

object Number extends App {

  private val numbers: List[Number] = List(Number("1", false), Number("2", true), Number("3", false), Number("4", true), Number("5", false))

  private val evenNumbers = numbers.filter(num => num.isEven)

  private val oddNumbers = numbers.filterNot(num => num.isEven)

  private val evenPartitionedNumbers = numbers.partition(num => num.isEven)

  private val oddPartitionedNumbers = numbers.partition(num => !num.isEven)

  private val firstFieldOfEvenNumbers = evenNumbers.map(num => num.string.toInt)

  println(s"$evenNumbers\n$oddNumbers\n$evenPartitionedNumbers\n$oddPartitionedNumbers\n$firstFieldOfEvenNumbers")

}