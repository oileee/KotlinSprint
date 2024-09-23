package org.example.lesson_1

const val SECONDS_IN_HOUR = 3600

const val SECONDS_IN_MINUTE = 60

fun main() {
    val secondsInSpace = 6480

    val hours = secondsInSpace / SECONDS_IN_HOUR

    val minutes = secondsInSpace % SECONDS_IN_HOUR / SECONDS_IN_MINUTE

    val seconds = secondsInSpace % SECONDS_IN_HOUR % SECONDS_IN_MINUTE

    println(String.format("%02d:%02d:%02d", hours, minutes, seconds))

}