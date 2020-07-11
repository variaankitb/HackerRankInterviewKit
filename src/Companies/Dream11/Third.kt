package Companies.Dream11

import java.io.*
import java.math.*
import java.security.*
import java.text.*
import java.util.*
import java.util.concurrent.*
import java.util.function.*
import java.util.regex.*
import java.util.stream.*
import kotlin.collections.*
import kotlin.comparisons.*
import kotlin.io.*
import kotlin.jvm.*
import kotlin.jvm.functions.*
import kotlin.jvm.internal.*
import kotlin.ranges.*
import kotlin.sequences.*
import kotlin.text.*



/*
 * Complete the 'autocomplete' function below.
 *
 * The function is expected to return an INTEGER_ARRAY.
 * The function accepts STRING_ARRAY command as parameter.
 */

fun autocomplete(command: Array<String>): Array<Int> {
    // Write your code here

    
}

fun main(args: Array<String>) {
    val commandCount = readLine()!!.trim().toInt()

    val command = Array<String>(commandCount, { "" })
    for (i in 0 until commandCount) {
        val commandItem = readLine()!!
        command[i] = commandItem
    }

    val result = autocomplete(command)

    println(result.joinToString("\n"))
}
