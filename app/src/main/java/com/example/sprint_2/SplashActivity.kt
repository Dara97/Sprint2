package com.example.sprint_2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
        val boton1=findViewById<Button>(R.id.btnGetStarted)
        boton1.setOnClickListener {
            val intento1 = Intent(this, HomeActivity::class.java)
            startActivity(intento1)
        }
    }
}