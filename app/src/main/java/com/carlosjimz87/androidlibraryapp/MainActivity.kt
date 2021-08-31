package com.carlosjimz87.androidlibraryapp

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.carlosjimz87.applibrary.Manager

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.d("TRACK_DEBUG", "String ${Manager.getString()}")
        Log.d("TRACK_DEBUG", "Boolean ${Manager.getBoolean()}")
        Log.d("TRACK_DEBUG", "Float ${Manager.getFloat()}")
        Log.d("TRACK_DEBUG", "Int ${Manager.getInt()}")
    }
}