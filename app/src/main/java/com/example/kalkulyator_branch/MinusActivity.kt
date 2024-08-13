package com.example.kalkulyator_branch


import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.kalkulyator_branch.databinding.ActivityMinusBinding

class MinusActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMinusBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMinusBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Retrieve the result from the Intent
        val result = intent.getDoubleExtra("RESULT", 0.0)
        binding.ResultTextView.text = result.toString()
    }
}