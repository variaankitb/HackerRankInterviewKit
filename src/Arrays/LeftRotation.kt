package Arrays

import java.util.*

// Complete the rotLeft function below.
fun rotLeft(a: Array<Int>, d: Int): Array<Int> {

    val transformedArray = Array(a.size) { i -> i * 1 }
    for (i in a.indices) {
        val newIndex = ((i + (a.size - d)) % a.size)
        transformedArray[newIndex] = a[i]
    }

    return transformedArray
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val nd = scan.nextLine().split(" ")

    val n = nd[0].trim().toInt()

    val d = nd[1].trim().toInt()

    val a = scan.nextLine().split(" ").map { it.trim().toInt() }.toTypedArray()

    val result = rotLeft(a, d)

    println(result.joinToString(" "))
}