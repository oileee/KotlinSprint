package org.example.lesson_3

fun main() {
    var currentMove = "D2-D4;0"

    var positionFrom = currentMove.split("-", ";")[0]
    var positionTo = currentMove.split("-", ";")[1]
    var numberOfMove = currentMove.split("-", ";")[2]

    println(positionFrom)
    println(positionTo)
    println(numberOfMove)
}