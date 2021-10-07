package com.kotlin.Abstraction

/**
 * Abstraction
 * 1- abstract class cannot be instantiated  directly
 * 2- Abstract Method only belongs to Abstract
 * 3- Abstract Method does not have any body
 *
 *Interface
 * 1- interface is not a class, it cannot be instantiated
 * 2- The interface can have only abstract methods
 * 3- The implementation of the methods of interface
 * will be in separate class which will implement that interface
 */
//abstract class Animal {
//    //Abstract Method does not have any body

//    abstract fun animalSound()
//
//    abstract fun sleep()
//
//    abstract fun foodType()
//
//    abstract fun animalDrink()
//
//
//
//}
interface  Animal {
     fun animalSound()
     fun sleep()
     fun foodType()
     fun animalDrink()
}