fun main(){

    var theList = mutableListOf<Int>(1, 2, 4, 56, 7, 4, 3, 5, 1, 1, 1, 2)

    var theSet = mutableSetOf<Int>()
    for (set in theList) {
        theSet.add(set)

    }
    //print(theSet)

//    var firList = mutableListOf<Int>(1, 2, 4, 56, 7, 4, 3, 5, 1, 1, 1, 2)
//    var secList = mutableListOf<Int>(22, 334, 356, 37, 334, 333, 335, 413, 416, 121, 1112)
//    var third = firList+secList
//    println(third)



    var map = mutableMapOf<String, String>()
    println("Enter the number of number of colors you want to add: ")
   var number_of_colors = readLine()!!.toInt()
    for (num in 1..number_of_colors) {
        println("Enter the name of the color you want to add: ")
       var name_of_color = readLine()!!
       println("Enter the code of the color here:")
       var color_code = readLine()!!
       map.put(name_of_color, color_code)

   }
    println(map)
}

//    for(num in 1..firList.size ){
//
//        third.add(num)
//        for(num2 in 1..secList.size ){
//            third.add(num2)
//        }
//    }
//    print(third)


