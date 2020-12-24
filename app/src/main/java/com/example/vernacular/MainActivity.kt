package com.example.vernacular

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.Spinner
import android.widget.TextView
import androidx.fragment.app.Fragment

class MainActivity : AppCompatActivity() {
    private val TAG = "MainActivity"

    lateinit var myPreferences: MyPreferences

    override fun onCreate(savedInstanceState: Bundle?) {
        Log.d(TAG, "onCreate is running")
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val display_text = findViewById<TextView>(R.id.textView)
        display_text.setOnClickListener {
            startActivity(Intent(this, setting::class.java))
        }

        val next = findViewById<Button>(R.id.nextbtn)
        next.setOnClickListener {
            startActivity(Intent(this,second::class.java))
        }
    }

    override fun attachBaseContext(newBase: Context?) {
        Log.d(TAG, "attachBaseContext is running")
        myPreferences = MyPreferences(newBase!!)
        val lang: String? = myPreferences.getLanguage()
        super.attachBaseContext(lang?.let { MyContextWrapper.wrap(newBase, it) })
    }

    override fun onStart() {
        Log.d(TAG, "onStart is running ", )
        super.onStart()
    }

    override fun onResume() {
        Log.d(TAG, "onResume is running ")
        super.onResume()
    }

    override fun onPause() {
        Log.d(TAG, "onPause is running")
        super.onPause()
    }

    override fun onStop() {
        Log.d(TAG, "onStop is running")
        super.onStop()
    }

    override fun onRestart() {
        Log.d(TAG, "onRestart is running")
        super.onRestart()
    }

    override fun onDestroy() {
        Log.d(TAG, "onDestroy is running")
        super.onDestroy()
    }
}

