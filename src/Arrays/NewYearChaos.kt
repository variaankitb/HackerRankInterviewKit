package Arrays

import java.util.*

// Complete the minimumBribes function below.
fun minimumBribes(q: Array<Int>): Unit {

    var swapCount = 0

    for(i in q.indices){
        if(q[i] != i + 1){ // Case One where the positions are not swapped.
            
        }
    }


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