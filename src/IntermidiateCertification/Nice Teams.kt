package IntermidiateCertification

import java.util.*
import kotlin.math.abs


/*
 * Complete the 'maxPairs' function below.
 *
 * The function is expected to return an INTEGER.
 * The function accepts following parameters:
 *  1. INTEGER_ARRAY skillLevel
 *  2. INTEGER minDiff
 */

fun maxPairs(skillLevel: Array<Int>, minDiff: Int): Int {
    // Write your code here
    var count = 0
    skillLevel.sort()
    var i = 0
    var j = 1

    while (i < skillLevel.size) {
        if (i != j && skillLevel[j] - skillLevel[i] >= minDiff) {
            count += 1
            j += 1
        } else if (skillLevel[j] - skillLevel[i] < minDiff && j < skillLevel.size - 1) {
            j += 1
        } else {
            i += 1
            j = 0
        }
    }

    return count
}

fun main(args: Array<String>) {
    val skillLevelCount = readLine()!!.trim().toInt()

    val skillLevel = Array<Int>(skillLevelCount, { 0 })
    for (i in 0 until skillLevelCount) {
        val skillLevelItem = readLine()!!.trim().toInt()
        skillLevel[i] = skillLevelItem
    }

    val minDiff = readLine()!!.trim().toInt()

    val result = maxPairs(skillLevel, minDiff)

    println(result)
}