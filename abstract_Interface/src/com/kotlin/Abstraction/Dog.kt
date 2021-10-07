package com.kotlin.Abstraction

class Dog: Animal {
    override fun animalSound() {
        println("The dog sound says: woof wooff")
    }

    override fun sleep() {
        println("The is sleeping ZZZzzzZzzZZZ")

    }

    override fun animalDrink() {
        println("water")
    }

    override fun foodType() {
        println("greens")
    }
}