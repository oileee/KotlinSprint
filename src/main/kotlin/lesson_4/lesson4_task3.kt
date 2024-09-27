package org.example.lesson_4

const val WEATHER_IS_SUNNY = true
const val AWNING_IS_OPEN = true
const val GOOD_HUMIDITY = 20
const val BAD_SEASON = "зима"

fun main() {
    var isSunnyWeather: Boolean = true
    var isAwningOpen: Boolean = true
    var currentHumidity: Int = 20
    var currentSeason: String = "зима"

    println("Благоприятные ли условия сейчас для роста бобовых? ${(isSunnyWeather == WEATHER_IS_SUNNY) && 
            (isAwningOpen == AWNING_IS_OPEN) && 
            (currentHumidity == GOOD_HUMIDITY) && 
            (currentSeason != BAD_SEASON)}")
}