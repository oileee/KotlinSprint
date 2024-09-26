package org.example.lesson_3

fun main() {
    var currentMove = "D2-D4;0"

    var positionFrom = currentMove.slice(0..1)
    var positionTo = currentMove.slice(3..4)
    var numberOfMove = currentMove.substringAfter(';')

    println(positionFrom)
    println(positionTo)
    println(numberOfMove)
}