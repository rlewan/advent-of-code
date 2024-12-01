package pl.rlewan.aoc2024.day1

import kotlin.math.absoluteValue

fun calculateDistance(a: List<Int>, b: List<Int>): Int {
    if (a.size != b.size || a.isEmpty()) throw IllegalArgumentException()

    return a.sorted().zip(b.sorted())
        .map { (it.second - it.first).absoluteValue }
        .reduce { acc, value -> acc + value }
}