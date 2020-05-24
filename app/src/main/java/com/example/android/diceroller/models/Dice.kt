package com.example.android.diceroller.models

import java.util.Random

interface Dice {
    fun roll()
    fun value(): Any
}

class FairDice: Dice {
    private var currentValue = 0

    /**
     * Rolls a dice and sets the current dice value
     */
    override fun roll() {
        currentValue = Random().nextInt(6) + 1
    }

    /**
     * Returns the current value
     */
    override fun value() = currentValue
}