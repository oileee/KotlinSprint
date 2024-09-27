package org.example.lesson_3

fun main() {
    val currentMove = "D2-D4;0"

    val splitCurrentMove = currentMove.split("-", ";")
    val positionFrom = splitCurrentMove[0]
    val positionTo = splitCurrentMove[1]
    val numberOfMove = splitCurrentMove[2]

    println(positionFrom)
    println(positionTo)
    println(numberOfMove)
}