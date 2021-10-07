package com.kotlin.lap3

class Apple(
    brand: String, Model: String, year: Int, phonetype: String, charger: String, memory: Int, ram: Int,
    screenSize: Double) : Smartphones(brand, Model, year, phonetype, charger, memory, ram, screenSize) {
    override fun SmartPhoneBrad(): String {
        return  brand
    }

    override fun SmartPhooneModel(): String {
        return Model
    }

    override fun SmartPhonerrelseYear(): Int {
        return year
    }

    override fun SmartPhonerrelseType(): String {
        return phonetype
    }

    override fun SmartPhoneChargerType(): String {
        return charger
    }

    override fun SmartPhoneMemSize(): Int {
        return memory
    }

    override fun SmartPhoneRAMSize(): Int {
        return ram
    }

    override fun SmartPhoneSCREENsize(): Double {
        return screenSize
    }
}