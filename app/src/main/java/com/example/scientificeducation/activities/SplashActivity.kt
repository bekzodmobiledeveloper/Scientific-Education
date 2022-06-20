package com.example.scientificeducation.activities

import android.content.Intent
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import android.view.View
import androidx.appcompat.app.AppCompatDelegate
import com.example.scientificeducation.R
import com.example.scientificeducation.databinding.ActivitySplashBinding

class SplashActivity : AppCompatActivity() {

    lateinit var binding: ActivitySplashBinding
    lateinit var mediaPlayer: MediaPlayer
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySplashBinding.inflate(layoutInflater)
        setContentView(binding.root)
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO)

//        if (AppCompatDelegate.getDefaultNightMode() == AppCompatDelegate.MODE_NIGHT_YES) {
//            setTheme(R.style.Theme_ScientificEducation)
//        }else{
//            setTheme(R.style.Theme_ScientificEducation)
//
//        }
        supportActionBar?.hide()
        window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_FULLSCREEN

        startTimeCounter1(this)

        startTimeCounter(this)
    }

    private fun startTimeCounter(view: SplashActivity) {
        object : CountDownTimer(2500, 1000) {
            override fun onTick(millisUntilFinished: Long) {

            }

            override fun onFinish() {
                mediaPlayer.stop()
                val intent = Intent(this@SplashActivity, MainActivity::class.java)
                startActivity(intent)
                overridePendingTransition(R.anim.anim_slide_in_left, R.anim.anim_slide_in_bottom)
                finish()
            }
        }.start()

    }

    private fun startTimeCounter1(view: SplashActivity) {
        object : CountDownTimer(1000, 1000) {
            override fun onTick(millisUntilFinished: Long) {

            }

            override fun onFinish() {
                binding.text.setCharacterDelay(50)
                binding.text.animateText("Scientific \n Education")
                mediaPlayer = MediaPlayer.create(this@SplashActivity, R.raw.klv)
                mediaPlayer.start()
                mediaPlayer.isLooping = true
            }
        }.start()

    }
}