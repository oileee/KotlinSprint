package org.example.lesson_2

import kotlin.math.pow
import kotlin.math.roundToInt

fun main() {
    var initialDepositAmount = 70_000
    var depositRate = 16.7
    var depositTerm = 20

    var finalDepositAmount = ((initialDepositAmount * (1 + depositRate / 100).pow(depositTerm) * 1000).roundToInt()) / 1000.0

    println(finalDepositAmount)

}