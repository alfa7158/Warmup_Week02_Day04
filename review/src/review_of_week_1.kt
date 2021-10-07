/*
variables and conditions
 functions and anonymous functions
 Null saftey and expertion
Scope functions, collections

 */
//fun main {block of code}

//variables
//declartion = assigment
//keyword - variable = value
//var -> variable
//val -> read only
//var num = 20 // type infereance
//num = 30
//val pie = 3.14
// cannot change the value of pie
/* Data Types
* Int -> 1234
* Double -> 2.21
* Float -> 2.2111f
* String -> "Hello world"
* Long - > 11234567898765
* Boolean -> True, False
* char -> 'A'
*
* keyword variableName : Data type
*
 **/
//    val name = "Alfaraj"
//    var age:Int = 11
//    var weight:Float = 66.22F
//    var height:Int = 120
//    //assign value for a varible
//    var the_Name = name
//
//    // show output to user
//    print("The name of this person is" +name + height)
//
//    // the other way // this way name String template
//    print("The name of this person is $name and his height is $height")
//
//    //varibales calculation
//    var tringleA = 50
//    var tringleB = 20
//    var tringleC = 30
//    val area = tringleA + tringleB +tringleC
//    print("The value of this triangle area is $area")


/**
 * comparsion operator
 * == -> equal
 * != -> Not equal
 * < -> less than
 * > -> greater than
 * <= -> less than or equal
 *  * >= -> greater than or equla

 **/

/**
 * if condition
 * if(comparison){true}else{False}
 */

//    if(10>20){
//        print("yes")
//    }else{
//        print("No")
//    }
//    var fname = 10
//    var sname = 20
//    //conditions with variables
//    if(fname>sname){
//        print("yes")
//
//    }else {
//        print("No")
//    }

// condition with variable and static value
//    var num1 = 34
//
//if(num1>11){
//    print("yes")
//}else{
//    print("No")
//}
//Multiple condition
// if(comparison) {true}else if(second condition) else(final condition)
//    var math = 33
//    var bio = 43
//    var phy = 45
//    if(math>bio && math>phy){
//        print("Math is the best")
//    }else if(bio>math && bio>phy){
//        print("bio is the best")
//
//    }else{
//        println("phy is the best")
//
//    }

// if expression
// var variable_name = if(comparison){return value}else{return value}
//    var number1 = 33
//   var number2 = 43
//var condition = if(number1>number2)  {
//    "Number one is greater than number two"
//
//}else {
//    "number is greater than number one"
//}
//    println(condition)


// When
// When(value for the cases you want to check for){caseOne -> {} else -> {}}
//    var name = "Ali"
//    when (name) {
//        "Ali" -> {
//            print("His name is $name")
//        }
//        "Abdullah" -> {
//            print("His name is $name")
//        }
//        else -> {
//            print("person has no name")
//        }
//
//
//    }
//    var age = 15
//    when (age) {
//        in 0..14 -> {
//            print("Child")
//        }
//        in 14..21 -> {
//            println("teen")
//        }
//        else -> println("unknown")
//    }
////when expression
//// var variableNmae
//    var whenCondition =     when (age) {
//        in 0..14 -> {
//            "Child"
//        }
//        in 14..21 -> {
//           "teen"
//        }
//        else -> "unknown"
//    }
//    println(whenCondition)
// Object operations

//var username = "Abdullah"
//username.uppercase()
//var number1 = 123
//println(number1.plus(7))

//fun main() {
//    //callig output function
//    //functionName()
//    output()
//    multi(2,4)
//   var value =  sum(1,3)
//    print(value)
//}
//
///*Functions*/
////fun functionName(parameter){block of code}
//
//fun output(){
//    print("Hello world")
//}
//
////Functions with parameters
////fun functionNmae: Data type, parameterTwo....)
//
//fun sum(nu:Int,nu2:Int):Int{
//    return(nu+nu2)
//}
//
////Functions with return type
//
///// fun functionName() : DataType {return value}
//
//fun myNmae():String{
//    var name = "Abdullah"
//    return name
//}
//
////single-Expression function
//// fun functionNmae():DataType = value
//// Note: single-Expression function is only used for
//// simple function and not a function that has many lines of code
//fun multi(numm1:Int,numm2:Int):Int = numm1*numm2

//fun main(){
//    theTringleP("tringle",10,20,20, ){a,b,c ->
//        a+b+c}
//}
//
/////anonymous function
//
//fun tringle(a:Int,b:Int,c:Int):Int{
//
//    return(a+b+c)
//}
////fun equation(): Int
//fun theTringleP(type:String,a:Int, b:Int,c:Int, equation:(Int,Int,Int) ->Int):Int{
//    when(type){
//        "Tringle" -> return equation(a,b,c)
//        else -> return 0
//    }
//}


////Null safety and Exception
//fun main(){
//    //Nullablity
//    var num:Int? = 23
//    //num = null
//// safe call operator
//num?.plus(100)
////non-null asserted call!!
//    num!!.plus(211)
//
////check nulability with if condition
//
//if(num!=null) {
//    println("Not null")
//}  else{
//    println("null")
//
//}
//
//
//// check nulability with Scope function
//// let checks if null doese not do anything and if not, it would do what is inside it
//    num?.let {
//        println("Not null")
//    }
//
//
////check nullability Elvis
////var name:String? = "Abdullah"
//////the statment below means that if the name length is null, return 0
////println(name?.length ?:0)
////
////val username:String? = null
////val nickname :String = username?:"Nick name"
////
////
////
////}
////fun total(name:String?,last:String?){
////    name?.length?:0
////    last?.length?:0
////
////}


    //val username:String? = null
/// the statement below tell us that if the user name is null , throw the exception "Null"
    // username ?:throw Exception("Null")
// Handing Exceptions
// try{handling code} catch{Exception type}

//    try {
//        var age = readLine()!!.toInt()
//    } catch (e: Exception) {
//        println("Null point exception ${e.message}")
//    }

    // let object referance -> It
    //result value -> lambda

//    var num1: Int? = 453
//    var number = num1?.let {
//        //println(it)
//        it + it
//    }
//    println(number)


// apply
// object referance -> this
//result value -> context object
//
//    var name = "Abdullah"
//    var nickName = name.apply {
//        print(uppercase())
//
//
//    }
//
//    println(nickName)

//with
//    // object reference -> this
//    // result value -> lambda result
//    var name = "Abdullah"
//    var nameUperCase = with(name){
//        uppercase()
//    }
//    println(nameUperCase)

//run
//object reference -> this
// result value -> lambda
//var num2:Int? = null
//num2?.run {
//    println(plus(50))
//}
//    num2 =12
//    var num3 = num2.run {
//        plus(50)
//    }
//    println(num3)
//
//
//
//    var user = "Abdullah Alfaraj"
//    var password:String?
//    user.also {
//        password = "$it:123456"
//    }
//    println(password)


//also
// object reference -> it
//result value -> context object



//    var books = mutableListOf<String>("Math", "BIO", "PHY")
//    for(saver in books){
//        println(saver)
//    }
//    var books1 = mutableListOf<String>("Math", "BIO", "PHY")
//    for(savery in 0..books1.size-1){
//        println(books1.get(savery))
//    }
//    for(savery in 0 until books1.size){
//        println(books1.get(savery))
//    }
//    for(i in 0..10 step 2){
//        println(i)
//    }
//

///// while
//fun main() {
//    var x = 0
//    while (x<10){
//        x++
//        println(x)
//    }
//}

