package Certification

import java.util.*

fun parliamentParties(votes: Array<String>): Array<String> {
    // Write your code here

    val voteCount: TreeMap<String, Int> = TreeMap()
    val nameOfParties = arrayListOf<String>()
    for (element in votes) {
        if (voteCount.containsKey(element)) {
            val count = voteCount[element] ?: 0
            voteCount[element] = count + 1
        } else {
            voteCount[element] = 1
        }
    }

    for (element in voteCount.entries) {
        val per = (element.value * 100) / votes.size
        if (per >= 5) {
            nameOfParties.add(element.key)
        }
    }

    return nameOfParties.toTypedArray()
}

fun main(args: Array<String>) {
    val votesCount = readLine()!!.trim().toInt()

    val votes = Array<String>(votesCount, { "" })
    for (i in 0 until votesCount) {
        val votesItem = readLine()!!
        votes[i] = votesItem
    }

    val result = parliamentParties(votes)

    println(result.joinToString("\n"))
}