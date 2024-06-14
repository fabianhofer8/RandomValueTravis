package com.example.randomvalue

import java.util.Random

class RandomValueGenerator {
    fun generateRandomValue(): Int {
        val random = Random()
        return random.nextInt(100) + 1
    }
}