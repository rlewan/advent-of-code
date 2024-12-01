package pl.rlewan.aoc2024.day1

import kotlin.math.absoluteValue

fun calculateDistance(left: List<Int>, right: List<Int>): Int {
    if (left.size != right.size || left.isEmpty()) throw IllegalArgumentException()

    return left.sorted().zip(right.sorted())
        .map { (it.second - it.first).absoluteValue }
        .reduce { acc, value -> acc + value }
}

fun calculateSimilarityScore(left: List<Int>, right: List<Int>): Int {
    if (left.size != right.size || left.isEmpty()) throw IllegalArgumentException()

    val counts = prepareCounts(right)

    return left.fold(0) { acc, value ->
        acc + value * counts.getOrDefault(value, 0)
    }
}

fun prepareCounts(list: List<Int>): Map<Int, Int> {
    return list.fold(mutableMapOf()) { map, element ->
        map.apply { merge(element, 1) { current, _ -> current + 1 } }
    }
}