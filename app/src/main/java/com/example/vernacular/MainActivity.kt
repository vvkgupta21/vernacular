package com.example.vernacular

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.Spinner
import android.widget.TextView
import androidx.fragment.app.Fragment

class MainActivity : AppCompatActivity() {

    lateinit var myPreferences: MyPreferences

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val display_text = findViewById<TextView>(R.id.textView)
        display_text.setOnClickListener {
            startActivity(Intent(this, setting::class.java))
        }
    }

    override fun attachBaseContext(newBase: Context?) {
        myPreferences = MyPreferences(newBase!!)
        val lang: String? = myPreferences.getLanguage()
        super.attachBaseContext(lang?.let { MyContextWrapper.wrap(newBase, it) })
    }
}

