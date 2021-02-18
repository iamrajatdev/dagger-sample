package com.example.daggersample

import javax.inject.Inject

class Engine @Inject constructor() {

    fun startEngine(){
        println("Engine started successfully")
    }
}