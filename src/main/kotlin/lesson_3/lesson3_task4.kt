package org.example.lesson_3

fun main() {
    var positionFrom = "E2"
    var positionTo = "E4"
    var numberOfMove = 1

    var currentMove = "$positionFrom-$positionTo; $numberOfMove"
    println(currentMove)

    positionFrom = "D2"
    positionTo = "D3"
    numberOfMove = 2

    currentMove = "$positionFrom-$positionTo; $numberOfMove"
    println(currentMove)
}