package org.example.lesson_2

fun main() {
    var buffPercent = 0.2

    var crystalOre = 7
    var ironOre = 11

    var bonusCrystalOre = (crystalOre * buffPercent).toInt()
    var bonusIronOre = (ironOre * buffPercent).toInt()

    println("Бонусная кристаллическая руда: $bonusCrystalOre")
    println("Бонусная железная руда: $bonusIronOre")

}