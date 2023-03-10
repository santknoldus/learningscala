package com.knoldus.learningscala

object AbstractDataTypes extends App {

  abstract class Vehicle {
    val vehicleType: String
    def drive(vehicle: Vehicle): String
  }

  trait Suv {
    val suvName: String

  }

  class Truck extends Vehicle {
    override val vehicleType: String = "Truck"

    override def drive(vehicle: Vehicle): String = s"${vehicle.vehicleType} is being driving"
  }

  class Car extends Vehicle {
    val vehicleType: String = "car"
    def drive(vehicle: Vehicle): String = s"${vehicle.vehicleType} is being driving"
  }



  val car = new Car
  val truck = new Truck
  println(car.drive(truck))
  println(truck.drive(truck))
  println(truck.drive(car))
}
