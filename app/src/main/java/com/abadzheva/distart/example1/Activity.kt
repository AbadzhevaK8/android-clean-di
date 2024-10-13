package com.abadzheva.distart.example1

class Activity {
    lateinit var keyboard: Keyboard

    init {
        Component().inject(this)
    }
}
