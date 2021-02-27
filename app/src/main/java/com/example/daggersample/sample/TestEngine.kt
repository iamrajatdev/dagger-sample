package com.example.daggersample.sample

import android.util.Log
import javax.inject.Inject
import javax.inject.Named

private const val TAG = "TestEngine"

class TestEngine @Inject constructor(
    @Named("numOfTests") var numOfTests: Int,
    @Named("numOfSecondTest") var numOfSecondTest: Int
) : Engine {

    override fun startEngine() {
        Log.d(TAG, "startEngine: $numOfTests $numOfSecondTest")
    }
}