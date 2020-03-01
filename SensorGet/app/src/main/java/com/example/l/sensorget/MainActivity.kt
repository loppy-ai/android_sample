package com.example.l.sensorget

import android.content.Context
import android.hardware.Sensor
import android.hardware.SensorManager
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import java.lang.StringBuilder

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buffer = StringBuilder()

        val sensorManager = getSystemService(Context.SENSOR_SERVICE) as SensorManager
        val sList: List<Sensor> = sensorManager.getSensorList(Sensor.TYPE_ALL)
        for(sensor: Sensor in sList){
            buffer.append("${sensor.stringType}, ${sensor.name}, ${sensor.vendor}\n")
        }
        txt01.text = buffer.toString()
    }
}
