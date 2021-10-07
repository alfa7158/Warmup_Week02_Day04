package com.kotlin.shape

class Circle(var radius:Double): Shape() {


    override fun calculateArea(): Double {
       return 3.14 * radius * radius
    }

    override fun calculateCirumference(): Double {
        return 2 * 3.14 * radius
    }



}