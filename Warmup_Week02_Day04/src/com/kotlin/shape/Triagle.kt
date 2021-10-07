package com.kotlin.shape

class Triagle(var height:Double,var base:Double):Shape() {
    override fun calculateArea(): Double {
        return 0.5*height*base
    }

    override fun calculateCirumference(): Double {
        return 0.0
    }
}