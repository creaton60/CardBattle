package com.creaton.card.battle

fun main() {
    println("Hello Card Battle")

    mainThread(true)
}

fun mainThread(start: Boolean = true, name: String = "com.creaton.card.battle.mainThread") {

    while(true) {
        Thread.sleep(1000)

        println("test")

    }
}
