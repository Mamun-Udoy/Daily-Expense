package com.example.dailyexpense.utils

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import androidx.lifecycle.lifecycleScope
import com.example.dailyexpense.MainActivity
import com.example.dailyexpense.R
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class SplashScreenActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val sharedPreferences = getSharedPreferences("MyPrefs", MODE_PRIVATE)
        val shouldShowCustomSplash = sharedPreferences.getBoolean("showCustomSplash", true)

        if (shouldShowCustomSplash) {
            installSplashScreen()
            setContentView(R.layout.activity_splash_screen)
            lifecycleScope.launch {
                delay(3000)
                startActivity(Intent(this@SplashScreenActivity, MainActivity::class.java))
                finish()


            }
            sharedPreferences.edit().putBoolean("showCustomSplash", true).apply()


        } else {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish()


        }
    }
}