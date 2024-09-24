package org.example.lesson_2

fun main() {
    var crystalOre = 7
    var ironOre = 11

    var bonusCrystalOre = (crystalOre * 0.2).toInt()

    var bonusIronOre = (ironOre * 0.2).toInt()

    println("Бонусная кристаллическая руда: $bonusCrystalOre")

    println("Бонусная железная руда: $bonusIronOre")

}