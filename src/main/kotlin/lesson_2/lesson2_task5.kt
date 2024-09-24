package org.example.lesson_2

//S = P*(1+ i)^n

import kotlin.math.pow
import kotlin.math.roundToInt

fun main() {
    var initialDepositAmount = 70_000
    var depositRate = 0.167
    var depositTerm = 20

    var finalDepositAmount = ((initialDepositAmount * (1 + depositRate).pow(depositTerm) * 1000).roundToInt()) / 1000.0

    println(finalDepositAmount)

}