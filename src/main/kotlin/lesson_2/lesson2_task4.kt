package org.example.lesson_2

fun main() {
    var buffPercent = 20

    var crystalOre = 7
    var ironOre = 11

    var bonusCrystalOre = (crystalOre * buffPercent / 100).toInt()
    var bonusIronOre = (ironOre * buffPercent / 100).toInt()

    println("Бонусная кристаллическая руда: $bonusCrystalOre")
    println("Бонусная железная руда: $bonusIronOre")

}