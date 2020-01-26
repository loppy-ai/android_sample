package com.example.l.helloworld

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        morningBtn.setOnClickListener{
            greetingText.text = getString(R.string.good_morning_text)
        }
        afternoonBtn.setOnClickListener {
            greetingText.text = getString(R.string.good_afternoon_text)
        }
        eveningBtn.setOnClickListener {
            greetingText.text = getString(R.string.good_evening_text)
        }
    }
}
