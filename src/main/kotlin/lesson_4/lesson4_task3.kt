package org.example.lesson_4

const val SUNNY_WEATHER = true
const val OPEN_TENT = true
const val GOOD_HUMIDITY = 20
const val BAD_SEASON = "зима"

fun main() {
    var weatherIsSunny: Boolean = true
    var tentIsOpen: Boolean = true
    var currentHumidity: Int = 20
    var currentSeason: String = "зима"

    println("Благоприятные ли условия сейчас для роста бобовых? ${(weatherIsSunny == SUNNY_WEATHER) && (tentIsOpen == OPEN_TENT) && (currentHumidity == GOOD_HUMIDITY) && (currentSeason != BAD_SEASON)}")
}