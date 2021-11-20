package com.example.sprint_2


import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton

class DetailActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail2)
        val boton1=findViewById<ImageButton>(R.id.imgToolbarBtnBack)
        boton1.setOnClickListener {
            val intento1 = Intent(this, HomeActivity::class.java)
            startActivity(intento1)
        }
    }
}