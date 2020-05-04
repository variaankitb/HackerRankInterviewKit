package Warmup

import java.util.*


// Complete the Warmup.sockMerchant function below.
fun sockMerchant(n: Int, ar: Array<Int>): Int {
    val setOfPairs = mutableSetOf<Int>()
    var pairCounter = 0

    for (i in 0 until n) {
        if (setOfPairs.contains(ar[i])) {
            setOfPairs.remove(ar[i])
            pairCounter++
        } else {
            setOfPairs.add(ar[i])
        }
    }
    return pairCounter
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val n = scan.nextLine().trim().toInt()

    val ar = scan.nextLine().split(" ").map { it.trim().toInt() }.toTypedArray()

    val result = sockMerchant(n, ar)

    println(result)
}
