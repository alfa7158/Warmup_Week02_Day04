package com.kotlin.Abstraction

class cat:Animal {
    override fun animalSound() {
        println("The cat says: Meowww")
    }

    override fun sleep() {
        println("The cat is sleeping zzzzZzZzz")
    }

    override fun animalDrink() {
        println("Water")
    }

    override fun foodType() {
        println("meat")
    }

}