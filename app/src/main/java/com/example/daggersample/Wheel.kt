package com.example.daggersample

import javax.inject.Inject

class Wheel @Inject constructor() {

    fun startWheel() {
        println("Wheel started successfully")
    }

}