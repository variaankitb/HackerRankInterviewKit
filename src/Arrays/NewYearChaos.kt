package Arrays

import java.util.*

// Complete the minimumBribes function below.
fun minimumBribes(q: Array<Int>): Unit {

    var swapCount = 0

    for (i in (q.size - 1) downTo 0) {
        if (q[i] != i + 1) { // Case One where the positions are not bribed.
            if (((i - 1) >= 0) && q[i - 1] == (i + 1)) {
                swapCount++
                swap(q, i, (i - 1))
            } else if (((i - 2) >= 0) && q[i - 2] == (i + 1)) {
                swapCount += 2
                swap(q, (i - 2), (i - 1))
                swap(q, (i - 1), i)
            } else {
                println("Too chaotic.")
                return
            }
        }
    }

    println(swapCount)
}

fun swap(ar: Array<Int>, a: Int, b: Int) {
    val temp = ar[a]
    ar[a] = ar[b]
    ar[b] = temp
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val t = scan.nextLine().trim().toInt()

    for (tItr in 1..t) {
        val n = scan.nextLine().trim().toInt()

        val q = scan.nextLine().split(" ").map { it.trim().toInt() }.toTypedArray()

        minimumBribes(q)
    }
}