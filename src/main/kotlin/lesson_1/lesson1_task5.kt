package org.example.lesson_1

fun main() {
    val secondsInSpace = 6480

    val minutesInSpace = secondsInSpace / 60

    val hoursInSpace = secondsInSpace / 3600

    val seconds = secondsInSpace % 3600 % 60

    val minutes = secondsInSpace % 3600 / 60

    println(String.format("%02d:%02d:%02d", hoursInSpace, minutes, seconds))

}