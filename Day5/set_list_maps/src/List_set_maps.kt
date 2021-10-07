fun main(){
    //Initialization of List
    //List operations
    //list can have doublict elements
    //var list = mutableListOf<Int>(2,4,5,7,8)
    //list.add(5)
    //list.remove(2)
    //print(list.get(0))
    //print(list.getOrNull(9))
    //print(list.getOrElse(6,{it}))
    //print(list)
    //println(list.size)
    //list.sortDescending()
    //print(list)
   // list.reverse()
    //println(list)

// loops
/*
    for(num in list){
        println(num)
    }
    //for each loop
    list.forEachIndexed() {Index,tmp ->
        println(Index.toString() +"-----"+tmp)
        //In this loops
    }

 /// if and else in the short format
    if(3 in list){
        print("true")
    }else{
        print("false")
    }


    val Students = listOf<String>("Abdullah","Ali", "Ahmed", "Hussain")

    val mutableStudents = Students.toMutableList()

    val readOnly = mutableStudents.toList()


    ///set
    //sets cannot have Doublicate elements
    var set = mutableSetOf<Int>(10,22,43,94,10)
    //print(set)
    println(set.size)
    set.remove(1)
    println(set)

    for(num in set){
        println(num)

    }
     */

    // my writing
   // val Mymap = mutableMapOf(1 to "one", 2 to "two", 2 to "two")
    //Mymap[3] = "three"
    //Mymap.put(4,"four")
    //print(Mymap.get(1))
    //Mymap.remove(1)
    //println(Mymap)
    ///maps /// class writing

    var map = mutableMapOf<String,Int>("One" to 1, "two" to 2, "three" to 3,"three" to 3)
    print(map.get("One"))
    println(map["two"])
    map.put("four",4)
    map.remove(("One"))
    map.replace("two",200,1000)
    /// getOr Default is the same as if or else
    println(map.getOrDefault("four",10))

    for(num in map){
        println(num)
        //println(num.key)
        //println(num.value)

    }
}

