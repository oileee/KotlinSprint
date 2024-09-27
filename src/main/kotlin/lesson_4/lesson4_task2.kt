package org.example.lesson_4

const val MIN_WEIGHT_OF_AVERAGE_CATEGORY_KILOS = 35
const val MAX_WEIGHT_OF_AVERAGE_CATEGORY_KILOS = 100
const val MAX_VOLUME_OF_AVERAGE_CATEGORY_LITRES = 100

fun main() {
    var weightOfCargoKilos = 20
    var volumeOfCargoLitres = 80

    println("Груз с весом $weightOfCargoKilos кг и объемом $volumeOfCargoLitres л соответствует категории 'Average': " +
            "${(weightOfCargoKilos > MIN_WEIGHT_OF_AVERAGE_CATEGORY_KILOS) && 
                    (weightOfCargoKilos <= MAX_WEIGHT_OF_AVERAGE_CATEGORY_KILOS) && 
                    (volumeOfCargoLitres < MAX_VOLUME_OF_AVERAGE_CATEGORY_LITRES)}")

    weightOfCargoKilos = 50
    volumeOfCargoLitres = 100

    println("Груз с весом $weightOfCargoKilos кг и объемом $volumeOfCargoLitres л соответствует категории 'Average': " +
            "${(weightOfCargoKilos > MIN_WEIGHT_OF_AVERAGE_CATEGORY_KILOS) && 
                    (weightOfCargoKilos <= MAX_WEIGHT_OF_AVERAGE_CATEGORY_KILOS) && 
                    (volumeOfCargoLitres < MAX_VOLUME_OF_AVERAGE_CATEGORY_LITRES)}")
}