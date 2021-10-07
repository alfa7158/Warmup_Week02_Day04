package com.kotlin.shape

fun main() {

    var myCir = Circle(2.0)
    println("The circle Area is :${myCir.calculateArea()}")
    println("The circle Cirumference is ${myCir.calculateCirumference()}")
    var myRec = Recangle(3.0,6.0)
    println(" The area of Rectangle is${myRec.calculateArea()}")
    println("The Cirumference : ${myRec.calculateCirumference()}")
    var Triagle = Triagle(2.0,6.0)
    println("The area of Triangle:${Triagle.calculateArea()}")

}