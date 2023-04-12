package com.jirmandevs.androidmaster

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.appcompat.widget.AppCompatButton

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btnStart = findViewById<AppCompatButton>(R.id.btnStar) //creamos una variable <tipo de vista>, ya esta enganchado el boton.
        btnStart.setOnClickListener {// cuando pulse el boton va hacer lo que dice entre llaves
            Log.i("jirman ","Button pulsado") //

        }
    }
}