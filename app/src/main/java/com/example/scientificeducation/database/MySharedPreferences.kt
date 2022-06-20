package com.example.scientificeducation.database

import android.content.Context
import android.content.SharedPreferences
import com.example.scientificeducation.utils.Count
import com.example.scientificeducation.utils.Info
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken


object MySharedPreferences {

    private const val NAME = "rakhmonov"
    private const val MODE = Context.MODE_PRIVATE
    private lateinit var preferences: SharedPreferences


    fun init(context: Context) {
        preferences = context.getSharedPreferences(NAME, MODE)
    }

    private inline fun SharedPreferences.edit(operation: (SharedPreferences.Editor) -> Unit) {
        val editor = edit()
        operation(editor)
        editor.apply()
    }

    fun save(key: String, value: Int) {
        val editor = preferences.edit()
        editor.putInt(key, value)
        editor.apply()
    }

    fun loadData(key: String): Int {
        return preferences.getInt(key, 0)
    }

    fun save1(key: String, list: ArrayList<Count>) {
        val editor: SharedPreferences.Editor = preferences.edit()
        val gson = Gson()
        val json = gson.toJson(list)
        editor.putString(key, json)
        editor.apply()
    }

    fun loadData1(key: String): ArrayList<Count> {
        val emptyList = Gson().toJson(ArrayList<Count>())
        return Gson().fromJson(
            preferences.getString(key, emptyList), object : TypeToken<ArrayList<Count>>() {}.type
        )
    }

    fun save2(key: String, info: Info) {
        val editor = preferences.edit()
        val gson = Gson()
        val json = gson.toJson(info)
        editor.putString(key, json)
        editor.apply()
    }

    fun loadData2(key: String): Info {
        val gson = Gson()
        val json = preferences.getString(key, null)
        return if (json!=null){
            gson.fromJson(json, Info::class.java)
        }else{
            Info()
        }

    }


}


