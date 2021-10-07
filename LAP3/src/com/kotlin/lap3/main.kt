package com.kotlin.lap3


//Google(
//    brand: String, Model: String, year: Int, phonetype: String, charger: String, memory: Int, ram: Int,
//    screenSize: Double
fun main() {


 var theBrand = readLine()!!
 var themodel = readLine()!!
 var theYear = readLine()!!.toInt()
 var thephoneT = readLine()!!
 var thephonecharger = readLine()!!
 var thememory = readLine()!!.toInt()
 var theram = readLine()!!.toInt()
 var thescreenSize = readLine()!!.toDouble()
 var list = mutableListOf<Google>(go)
 list.forEach { it ->

  var go = Google(theBrand, themodel, theYear, thephoneT, thephonecharger, thememory, theram, thescreenSize)


 }
}

}

