package com.jirmandevs.androidmaster

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.appcompat.widget.AppCompatButton
import androidx.appcompat.widget.AppCompatEditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btnStart = findViewById<AppCompatButton>(R.id.btnStar) //creamos una variable <tipo de vista>, ya esta enganchado el boton.
        val etName = findViewById<AppCompatEditText>(R.id.etName)



        btnStart.setOnClickListener {// cuando pulse el boton va hacer lo que dice entre llaves
            //creamos una variable
            val name = etName.text.toString()
            if (name.isNotEmpty()){
                Log.i("jirman ","Button pulsado $name") //
            }


        }
    }
}