package com.example.vernacular

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.Spinner

class setting : AppCompatActivity() {

    lateinit var myPreferences: MyPreferences
    val languageList: Array<String> = arrayOf("en","ta","fr","hi","es")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_setting)

        myPreferences = MyPreferences(this)
        val spinner = findViewById<Spinner>(R.id.spinner)
        spinner.adapter = ArrayAdapter(this, android.R.layout.simple_dropdown_item_1line,languageList)
        val lang = myPreferences.getLanguage()
        val index = languageList.indexOf(lang)

        if (index >= 0){
            spinner.setSelection(index)
        }

        val btn = findViewById<Button>(R.id.saveBtn)
        btn.setOnClickListener {
            myPreferences.setLanguage(languageList[spinner.selectedItemPosition])
            startActivity(Intent(this, MainActivity:: class.java))
        }
    }
}