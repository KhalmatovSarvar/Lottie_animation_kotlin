package com.example.lottie_animation_kotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.airbnb.lottie.LottieAnimationView

class MainActivity : AppCompatActivity() {

    lateinit var lottieAnimationView:LottieAnimationView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initViews()
    }

    private fun initViews() {
        var btn_facebook =  findViewById<Button>(R.id.btn_facebook)
        var btn_twitter =  findViewById<Button>(R.id.btn_twitter)
        var btn_youtube =  findViewById<Button>(R.id.btn_youtube)

        lottieAnimationView = findViewById(R.id.animation_container)
        lottieAnimationView.setAnimation("facebook.json")
        lottieAnimationView.playAnimation()

        btn_facebook.setOnClickListener {
            lottieAnimationView.setAnimation("facebook.json")
            lottieAnimationView.playAnimation()
        }

        btn_twitter.setOnClickListener {
            lottieAnimationView.setAnimation("twitter.json")
            lottieAnimationView.playAnimation()
        }

        btn_youtube.setOnClickListener {
            lottieAnimationView.setAnimation("youtube.json")
            lottieAnimationView.playAnimation()
        }

    }

}