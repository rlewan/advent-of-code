package pl.rlewan.aoc2024.day1

import kotlin.math.absoluteValue

fun calculateDistance(left: List<Int>, right: List<Int>): Int {
    if (left.size != right.size || left.isEmpty()) throw IllegalArgumentException()

    return left.sorted().zip(right.sorted())
        .map { (it.second - it.first).absoluteValue }
        .reduce { acc, value -> acc + value }
}