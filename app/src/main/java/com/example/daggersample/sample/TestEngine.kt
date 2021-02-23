package com.example.daggersample.sample

import android.util.Log

private const val TAG = "TestEngine"

class TestEngine constructor(var numOfTests: Int) : Engine {

    override fun startEngine() {
        Log.d(TAG, "startEngine: $numOfTests")
    }
}