package Companies.Dream11

// Divisible String
fun main(args: Array<String>) {
    val s1 = "bcdbcdbcdbcd"
    val t1 = "bcdbcd"
    val s2 = "bcdbcdbcd"
    val t2 = "bcdbcd"
    val s3 = "lrbblrbb"
    val t3 = "lrbb"
    println(getLength(s1, t1))
    println(getLength(s2, t2))
    println(getLength(s3, t3))
}

fun getLength(s: String, t: String): Int {
    if (s.length % t.length > 0) return -1
    var sb = StringBuilder()
    run {
        var i = 0
        while (i * t.length < s.length) {
            sb.append(t)
            i++
        }
    }
    if (sb.toString() != s) return -1
    var divisible = 1
    for (i in 1..t.length) {
        //optimized solution for skipping a few unrequired iterations
        if (t.length % divisible++ != 0) {
            continue
        }
        sb = StringBuilder()
        val subStr = t.substring(0, i)
        while (sb.length < t.length) {
            sb.append(subStr)
        }
        if (sb.toString() == t) return i
    }
    return -1
}