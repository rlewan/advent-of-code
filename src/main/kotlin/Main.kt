import pl.rlewan.aoc2024.day1.DayOneInputs
import pl.rlewan.aoc2024.day1.calculateDistance
import pl.rlewan.aoc2024.day1.calculateSimilarityScore

fun main() {
    val distance = calculateDistance(DayOneInputs.leftList, DayOneInputs.rightList)
    val similarityScore = calculateSimilarityScore(DayOneInputs.leftList, DayOneInputs.rightList)
    println("Answers to first day's puzzle are: distance: $distance, similarity score: $similarityScore")
}
