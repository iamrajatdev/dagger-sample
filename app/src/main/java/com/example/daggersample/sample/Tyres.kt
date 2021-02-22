package com.example.daggersample.sample

import javax.inject.Inject

class Tyres @Inject constructor() {

    fun tyre() {
        println("Tyre is running")
    }
}
