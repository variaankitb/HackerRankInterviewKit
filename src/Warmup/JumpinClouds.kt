package Warmup

import java.util.*

// Complete the Warmup.jumpingOnClouds function below.
fun jumpingOnClouds(c: Array<Int>): Int {

    var count = 0
    var index = 0

    while (index != (c.size - 1)) {
        index += if (index + 2 < c.size && c[index + 2] == 0) {
            2
        } else {
            1
        }
        count++
    }
    return count
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val n = scan.nextLine().trim().toInt()

    val c = scan.nextLine().split(" ").map { it.trim().toInt() }.toTypedArray()

    val result = jumpingOnClouds(c)

    println(result)
}