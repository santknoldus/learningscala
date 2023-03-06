package com.knoldus.learningscala
import scala.collection.immutable.Seq

case class Station(name: String)

case class Train(kind: String, number: Int, schedule: Seq[Station]) {
  require(schedule.take(2).size==2,"Schedule must contain at least two elements")
}
