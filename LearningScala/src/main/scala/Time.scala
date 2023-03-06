package com.knoldus.learningscala

case class Time(hours :Int = 0 , minutes : Int = 0){

  require(hours>=0 & hours<=23, "Invalid hours")
  require(minutes>=0 & minutes<=59, "Invalid minutes")

  val asMinutes = hours*60+minutes
  def minus(that:Time):Int = asMinutes-that.asMinutes
  def -(that:Time):Int = minus(that)
}
object Time extends App{
  def fromMinutes(minutes : Int) : Time = {
    val hours = minutes/60
    val minute = minutes%60
    Time(hours,minute)
  }
  val time  = Time.fromMinutes(61)
  println(time.hours)
  println(time.minutes)
  //val time = new Time(-1,-2)
}



