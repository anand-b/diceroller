package com.example.android.diceroller.utils

import java.util.Random

class Dice {
    var currentValue = 0
        private set

    /**
     * Rolls a dice and sets the current dice value
     */
    fun roll() {
        currentValue = Random().nextInt(6) + 1
    }
}