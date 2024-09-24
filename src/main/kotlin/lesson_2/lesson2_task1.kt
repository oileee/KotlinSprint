package org.example.lesson_2

fun main() {
    val englishGrade1 = 3f
    val englishGrade2 = 4f
    val englishGrade3 = 3f
    val englishGrade4 = 5f

    val averageGrade = (englishGrade1 + englishGrade2 + englishGrade3 + englishGrade4) / 4

    println("%.2f".format(averageGrade))

}