package app

import data.Person

fun main() {
    val jono = Person()
    jono.firstName = "Jono"
    jono.lastName = "Aja"

    val joni = Person()
    joni.firstName = "Joni"
    joni.lastName = "Aja"

    println(jono.firstName)
    println(joni.firstName)
}