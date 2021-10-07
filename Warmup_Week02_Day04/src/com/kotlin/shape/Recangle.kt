package com.kotlin.shape

class Recangle(var height:Double,var width:Double):Shape() {
    override fun calculateArea(): Double {
        return height*width
    }

    override fun calculateCirumference(): Double {
        return 2 * height + 2 * width
    }


}