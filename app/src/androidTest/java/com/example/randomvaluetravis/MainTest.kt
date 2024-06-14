package com.example.randomvaluetravis

import com.example.randomvalue.RandomValueGenerator
import junit.framework.TestCase.assertNotNull
import junit.framework.TestCase.assertTrue
import org.junit.Test

class MainTest {
    @Test
    fun testGenerateRandomValue() {
        val randomValueGenerator = RandomValueGenerator()
        val value = randomValueGenerator.generateRandomValue()

        // Check if the value is between 1 and 100
        assertTrue("Value should be between 1 and 100", value in 1..100)
    }
}