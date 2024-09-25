package org.example.lesson_2

const val MINUTES_IN_HOUR = 60
const val HOURS_IN_DAY = 24

fun main() {
    var hourOfDeparture: Byte = 9

    var minuteOfDeparture: Byte = 39

    var travelTime = 457

    var departureTime = hourOfDeparture * MINUTES_IN_HOUR + minuteOfDeparture

    var arrivalTime = departureTime + travelTime

    var hourOfArrival = arrivalTime / MINUTES_IN_HOUR % HOURS_IN_DAY

    var minuteOfArrival = arrivalTime % MINUTES_IN_HOUR

    println("%02d:%02d".format(hourOfArrival, minuteOfArrival))

}