package Companies.Booking


/*
 * Complete the 'roundPrice' function below.
 *
 * The function is expected to return a LONG_INTEGER.
 * The function accepts following parameters:
 *  1. INTEGER price
 *  2. INTEGER n
 */

fun roundPrice(price: Int, n: Int): Long {

}

fun main(args: Array<String>) {
    val price = readLine()!!.trim().toInt()

    val n = readLine()!!.trim().toInt()

    val result = roundPrice(price, n)

    println(result)
}