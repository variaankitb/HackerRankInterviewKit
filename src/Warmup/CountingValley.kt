package Warmup

import java.util.*

// Complete the Warmup.countingValleys function below.
fun countingValleys(n: Int, s: String): Int {
    var valleyCount = 0
    var altitudeCount = 0

    for (i in 0 until n) {
        val char = s[i]
        if (char == 'U') {
            altitudeCount++
            if (altitudeCount == 0) {
                valleyCount++
            }
        } else {
            altitudeCount--
        }
    }
    return valleyCount
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val n = scan.nextLine().trim().toInt()

    val s = scan.nextLine()

    val result = countingValleys(n, s)

    println(result)
}