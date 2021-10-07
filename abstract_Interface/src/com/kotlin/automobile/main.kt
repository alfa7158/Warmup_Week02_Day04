package com.kotlin.automobile

fun main(){

//    val accord = `Honda Accord`()
//    println(accord.getYear())
//    println(accord.getMake())
//    println(accord.getModel())
//    println(accord.getMake())
//    accord.startEngine()
//
//    val HondCITY = HondaCity()
//    println(HondCITY.getYear())
//    println(HondCITY.getMake())
//    println(HondCITY.getModel())
//    println(HondCITY.getMake())
//    println(HondCITY.fuel())
//    HondCITY.startEngine()
    var listOfcar = mutableListOf<String>("Ford","GMC","Honda","Kia", "Lexus")
    var aut1 = Automobile("toy",2020)
    var aut2 = Automobile("test",2020)
    var aut3 = Automobile("uytr",2020)
    var list = mutableListOf<Automobile>(aut1,aut2,aut3)

    list.forEach{it ->
        var automobile = Automobile(it.name,it.num)


        println(automobile.getYear())
        println(automobile.getMake())
        println(automobile.getModel())
        println(automobile.fuel())

    }

}