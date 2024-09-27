package org.example.lesson_4

fun main() {
    var dayOfTraining = 5

    var isEvenDay = (dayOfTraining % 2) == 0

    println("Упражнения для рук: ${!isEvenDay}\nУпражнения для ног: $isEvenDay\n" +
            "Упражнения для спины: $isEvenDay\nУпражнения для пресса: ${!isEvenDay}\n")

    dayOfTraining = 6

    isEvenDay = (dayOfTraining % 2) == 0

    println("Упражнения для рук: ${!isEvenDay}\nУпражнения для ног: $isEvenDay\n" +
            "Упражнения для спины: $isEvenDay\nУпражнения для пресса: ${!isEvenDay}\n")
}