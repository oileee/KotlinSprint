package org.example.lesson_2

import kotlin.math.roundToInt

fun main() {
    var numberOfEmployees = 50
    var employeeSalary = 30_000f
    var numberOfInterns = 30
    var internSalary = 20_000f

    var totalEmployeeSalary = numberOfEmployees * employeeSalary

    var totalSalary = totalEmployeeSalary + numberOfInterns * internSalary

    var averageSalary = totalSalary / (numberOfEmployees + numberOfInterns)

    println(totalEmployeeSalary.roundToInt())
    println(totalSalary.roundToInt())
    println(averageSalary.roundToInt())

}