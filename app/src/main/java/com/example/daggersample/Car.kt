package com.example.daggersample

import javax.inject.Inject

class Car @Inject constructor(engine: Engine, wheel: Wheel) {

    fun drive() {
        print("Driving car")
    }
}