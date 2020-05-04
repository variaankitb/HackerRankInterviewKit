package Warmup

import java.util.*


// Complete the Warmup.repeatedString function below.
fun repeatedString(s: String, n: Long): Long {

    var aCounter = 0
    val remainingChar = n % s.length
    val numberOfString = n / s.length

    for (i in s.indices) {
        if (s[i] == 'a') {
            aCounter++
        }
    }
    var totalACounter = aCounter * numberOfString

    return if(remainingChar == 0L){
        totalACounter
    }else {
        val subString = s.substring(0, remainingChar.toInt())
        for(char in subString.toCharArray()){
            if(char == 'a'){
                totalACounter++
            }
        }
        totalACounter
    }
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val s = scan.nextLine()

    val n = scan.nextLine().trim().toLong()

    val result = repeatedString(s, n)

    println(result)
}