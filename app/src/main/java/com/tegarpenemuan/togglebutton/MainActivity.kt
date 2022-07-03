package com.tegarpenemuan.togglebutton

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.tegarpenemuan.togglebutton.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding:ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.toogleButton.setOnClickListener {
            if (binding.toogleButton.isChecked()) {
                binding.toogleButton.setTextOn("On")
                binding.card.visibility = View.VISIBLE
            } else if (!binding.toogleButton.isChecked()) {
                binding.toogleButton.setTextOff("Off")
                binding.card.visibility = View.GONE
            }
        }
    }
}