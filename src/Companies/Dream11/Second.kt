package Companies.Dream11

import java.util.ArrayList


/*
 * Complete the 'getHeight' function below.
 *
 * The function is expected to return an INTEGER.
 * The function accepts INTEGER_ARRAY arr as parameter.
 */


fun main(args: Array<String>) {
    val arrCount = readLine()!!.trim().toInt()

    val arr = Array<Int>(arrCount, { 0 })
    for (i in 0 until arrCount) {
        val arrItem = readLine()!!.trim().toInt()
        arr[i] = arrItem
    }

    val result = getHeight(arr)

    println(result)
}

fun getHeight(arr: Array<Int>): Int {
    // Write your code here
    arr.sort()
    for(i in 0 until arr.size - 1){
        if(arr[i+1] - arr[i] > 1){
            arr[i+1] = arr[i] + 1
        }
    }
    return arr[arr.size - 1]
}