package com.example.daggersample.sample

import javax.inject.Inject

class PetrolEngine @Inject constructor() : Engine {
    override fun startEngine() {
        print("Petrol engine started")
    }
}