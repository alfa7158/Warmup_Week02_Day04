package com.kotlin.automobile

open class Automobile(var name:String, var num:Int):IAutomobile {
    override fun getYear(): Int {
        return num
    }

    override fun getMake(): String {
        return name
    }

    override fun getModel(): String {
        return "Accord"
    }

    override fun startEngine() {
        println("Vrroommm vroommm vromm ")
    }
    open fun fuel():String{
        return "Gasoline"
    }


}