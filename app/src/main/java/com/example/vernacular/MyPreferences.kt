package com.example.vernacular

import android.content.Context
import android.content.SharedPreferences

val PREFERENCE_NAME = "sharepreferenceexample"
val PREFERENCE_LANGUAGE = "Language"

class MyPreferences(context: Context) {

    val prefrences = context.getSharedPreferences(PREFERENCE_NAME, Context.MODE_PRIVATE)

    fun getLanguage() : String? {
        return prefrences.getString(PREFERENCE_LANGUAGE,"en")

    }

    fun setLanguage(Language: String){
        val editor: SharedPreferences.Editor = prefrences.edit()
        editor.putString(PREFERENCE_LANGUAGE,Language)
        editor.apply()
    }
}