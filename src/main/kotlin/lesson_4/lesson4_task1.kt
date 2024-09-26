package org.example.lesson_4

const val NUMBER_OF_TABLES = 13

fun main() {
    var todayReservedTable = 13
    var tomorrowReservedTable = 9

    println("Доступность столиков на сегодня: ${todayReservedTable < NUMBER_OF_TABLES}\nДоступность столиков на завтра: ${tomorrowReservedTable < NUMBER_OF_TABLES}")
}