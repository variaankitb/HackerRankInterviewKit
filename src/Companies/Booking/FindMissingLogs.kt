package Companies.Booking

import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*

fun findMissingLog(sortedLogIds: List<Int>): Int {
    val size = sortedLogIds.size
    var sum = (size + 1) * (size + 2) / 2
    for (i in 0 until size)
        sum -= sortedLogIds[i]
    return sum
}

fun main(args: Array<String>) {
    val sortedLogIds = fastReadList(InputStreamReader(System.`in`))

    val result = findMissingLog(sortedLogIds)
    println(result)
}


fun fastReadList(stream: InputStreamReader): List<Int> {
    val scanner = FastScanner(stream)
    val all = arrayListOf<Int>()
    while (scanner.hasNext()) {
        all.add(scanner.nextInt())
    }
    stream.close()
    return all
}

class FastScanner(stream: InputStreamReader) {
    private val st: StringTokenizer = StringTokenizer(BufferedReader(stream).readLine())

    fun hasNext(): Boolean {
        return st.hasMoreTokens()
    }

    operator fun next(): String {
        return st.nextToken()
    }

    fun nextInt(): Int {
        return Integer.parseInt(next())
    }
}