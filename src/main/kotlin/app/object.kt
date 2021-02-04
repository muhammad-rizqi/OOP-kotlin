package app

import data.Person

fun main() {
    val jono = Person("Jono", "bin", "Aja")
    val joni = Person("Joni", "bin", "Aja")

    println(jono.firstName)
    println(joni.firstName)
}