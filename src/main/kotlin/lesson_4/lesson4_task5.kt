package org.example.lesson_4

const val MIN_CREW_SIZE = 55
const val RECOMMENDED_CREW_SIZE = 70
const val MIN_NUMBER_OF_PROVISION_BOXES = 50

fun main() {
    val hullIsDamaged = readln().toBoolean()
    val numberOfCrewMembers = readln().toInt()
    val numberOfProvisionBoxes = readln().toInt()
    val weatherIsGood = readln().toBoolean()

    val conditionsAreMet1: Boolean = (!hullIsDamaged) && (numberOfCrewMembers in (MIN_CREW_SIZE..RECOMMENDED_CREW_SIZE)) && (numberOfProvisionBoxes > MIN_NUMBER_OF_PROVISION_BOXES)
    val conditionsAreMet2: Boolean = (numberOfCrewMembers == RECOMMENDED_CREW_SIZE) && (weatherIsGood) && (numberOfProvisionBoxes >= MIN_NUMBER_OF_PROVISION_BOXES)

    println("Может ли корабль отправиться в плавание? ${conditionsAreMet1 || conditionsAreMet2}")

}