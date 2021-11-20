package com.example.sprint_2


import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import kotlinx.android.synthetic.main.activity_home.*

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        val boton1=findViewById<ImageButton>(R.id.imageprimera)
        boton1.setOnClickListener {
            val intento1 = Intent(this, DetailActivity::class.java)
            startActivity(intento1)}
    boton2()

    }
    fun boton2() {
        imgmevlana.setOnClickListener(){
        val intento2: Intent = Intent(this, DetailActivity2::class.java)
        startActivity(intento2)
    }

    }
}