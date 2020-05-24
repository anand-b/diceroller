package com.example.android.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.widget.ImageView
import com.example.android.diceroller.databinding.ActivityMainBinding
import com.example.android.diceroller.models.Dice
import com.example.android.diceroller.models.FairDice
import com.example.android.diceroller.utils.fadeIn
import com.example.android.diceroller.utils.fadeOut

class MainActivity : AppCompatActivity() {

    // Dice reference to never change. The value that dice reference contains, however, can change.
    private val dice: Dice = FairDice()

    companion object {
        private const val FADE_ANIMATION_DURATION_MS = 1000L
    }

    init {
        // Do an automatic dice roll
        dice.roll()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        with(ActivityMainBinding.inflate(LayoutInflater.from(this))) {
            setContentView(root)
            // update the dice image with current dice state
            updateDiceImage(diceIv)
            btnRoll.setOnClickListener {
                dice.roll()
                updateDiceImage(diceIv)
            }
        }
    }

    private fun updateDiceImage(diceImageView: ImageView) {
        val diceImageRes = when(dice.value()) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            6 -> R.drawable.dice_6
            else -> R.drawable.empty_dice
        }
        diceImageView.apply {
            fadeOut(FADE_ANIMATION_DURATION_MS)
            setImageResource(diceImageRes)
            fadeIn(FADE_ANIMATION_DURATION_MS)
        }
    }
}
