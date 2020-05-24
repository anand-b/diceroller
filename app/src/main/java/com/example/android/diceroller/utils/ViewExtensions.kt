package com.example.android.diceroller.utils

import android.view.View

fun View.fadeOut(timeInMillis: Long) {
    this.apply {
        alpha = 1f;
        animate().alpha(0f).duration = timeInMillis
    }
}
fun View.fadeIn(timeInMillis: Long) {
    this.apply {
        alpha = 0f;
        animate().alpha(1f).duration = timeInMillis
    }
}