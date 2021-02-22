package com.example.daggersample.sample

import javax.inject.Inject

class DieselEngine @Inject constructor() : Engine {
    override fun startEngine() {
        print("Diesel engine started")
    }
}