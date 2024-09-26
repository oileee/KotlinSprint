package org.example.lesson_4

fun main() {
    var dayOfTraining = 5

    println("Упражнения для рук: ${(dayOfTraining % 2) == 1}\nУпражнения для ног: ${(dayOfTraining % 2) == 0}\nУпражнения для спины: ${(dayOfTraining % 2) == 0}\nУпражнения для пресса: ${(dayOfTraining % 2) == 1}\n")

    dayOfTraining = 6

    println("Упражнения для рук: ${(dayOfTraining % 2) == 1}\nУпражнения для ног: ${(dayOfTraining % 2) == 0}\nУпражнения для спины: ${(dayOfTraining % 2) == 0}\nУпражнения для пресса: ${(dayOfTraining % 2) == 1}\n")

}