package com.example.jobapplication.manager

import android.content.Context
import android.content.SharedPreferences

class SharedPrefManager(
    private val context: Context
) {
    private val sharedPreferences: SharedPreferences = context.getSharedPreferences("MyPref", Context.MODE_PRIVATE)

    fun saveFinish(isFinish: Boolean) {
        val editor = sharedPreferences.edit()
        editor.putBoolean("isFinish", isFinish)
        editor.apply()
    }
    fun getFinish(): Boolean {
        return sharedPreferences.getBoolean("isFinish", false)
    }
}