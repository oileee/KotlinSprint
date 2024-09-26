package org.example.lesson_4

fun main() {
    val minWeightOfAverage = 35
    val maxWeightOfAverageCategory = 100
    val maxVolumeOfAverageCategory = 100

    var weightOfCargo = 20
    var volumeOfCargo = 80

    println("Груз с весом $weightOfCargo кг и объемом $volumeOfCargo л соответствует категории 'Average': ${(weightOfCargo > minWeightOfAverage) && (weightOfCargo <= maxWeightOfAverageCategory) && (volumeOfCargo < maxVolumeOfAverageCategory)}")

    weightOfCargo = 50
    volumeOfCargo = 100

    println("Груз с весом $weightOfCargo кг и объемом $volumeOfCargo л соответствует категории 'Average': ${(weightOfCargo > minWeightOfAverage) && (weightOfCargo <= maxWeightOfAverageCategory) && (volumeOfCargo < maxVolumeOfAverageCategory)}")
}