package com.example.vernacular

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class second : AppCompatActivity() {

    lateinit var myPreferences: MyPreferences

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val text = findViewById<TextView>(R.id.display_text_2)
        text.setOnClickListener {
            startActivity(Intent(this, setting::class.java))
        }
    }

    override fun attachBaseContext(newBase: Context?) {
        myPreferences = MyPreferences(newBase!!)
        val lang: String? = myPreferences.getLanguage()
        super.attachBaseContext(lang?.let { MyContextWrapper.wrap(newBase, it) })
    }



}