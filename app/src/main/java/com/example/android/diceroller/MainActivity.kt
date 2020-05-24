package com.example.android.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import com.example.android.diceroller.databinding.ActivityMainBinding
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        with(ActivityMainBinding.inflate(LayoutInflater.from(this))) {
            setContentView(root)
            btnRoll.setOnClickListener {
                tvDiceValue.text = rollDice().toString()
            }
        }
    }

    private fun rollDice(): Int = Random().nextInt(6) + 1
}
