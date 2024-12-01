package pl.rlewan.aoc2024.day1

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Nested
import org.junit.jupiter.api.Test

class DayOneKtTest {
    @Nested
    inner class CalculateDistance {
        @Test
        fun `throws when lists are of unequal lengths`() {
            assertThrows(IllegalArgumentException::class.java) {
                calculateDistance(listOf(1, 2, 3), listOf(4))
            }
        }

        @Test
        fun `throws when lists are empty`() {
            assertThrows(IllegalArgumentException::class.java) {
                calculateDistance(emptyList(), emptyList())
            }
        }

        @Test
        fun `gives a correct answer to the sample`() {
            val a = listOf(3, 4, 2, 1, 3, 3)
            val b = listOf(4, 3, 5, 3, 9, 3)

            assertEquals(calculateDistance(a, b), 11)
        }
    }
}