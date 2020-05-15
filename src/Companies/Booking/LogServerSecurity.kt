package Companies.Booking

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.FileWriter
import java.io.InputStreamReader

fun maxLogs(logsCount: IntArray): Int {

   return     0
}

fun main(args: Array<String>) {
    val fileName = System.getenv("/Users/variaankit/Desktop/try.txt")
    val `in` = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(FileWriter(fileName))
    val res: Int

    var _sortedLogIds_size = 0
    _sortedLogIds_size = Integer.parseInt(`in`.readLine().trim { it <= ' ' })
    val _sortedLogIds = IntArray(_sortedLogIds_size)
    var line: String?
    for (_sortedLogIds_i in 0 until _sortedLogIds_size) {
        line = `in`.readLine()
        if (line == null) {
            break
        }
        _sortedLogIds[_sortedLogIds_i] = Integer.parseInt(line)
    }

    res = maxLogs(_sortedLogIds)
    bw.write(res.toString())
    bw.newLine()

    bw.close()
}