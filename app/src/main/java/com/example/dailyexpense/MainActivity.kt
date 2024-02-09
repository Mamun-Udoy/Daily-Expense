package com.example.dailyexpense

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.navigation.NavController
import androidx.navigation.findNavController
import com.example.dailyexpense.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {


    private lateinit var binding: ActivityMainBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        bottombar()
    }

    private fun showtoast(message: String) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show()

    }

    private fun bottombar() {

        binding.bottomNavigationView.background = null
        binding.bottomNavigationView.setOnNavigationItemSelectedListener {
            when (it.itemId) {
                R.id.home -> {
                    showtoast("you clicked home")
                    true
                }

                R.id.calendar -> {
                    showtoast("you clicked contact")
                    true
                }

                R.id.settings -> {
                    showtoast("you clicked settings")
                    true
                }

                else -> false

            }
        }
    }
}