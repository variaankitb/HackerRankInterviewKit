package Certification

import java.lang.StringBuilder

fun decryptPassword(s: String): String {
    // Write your code here
    var i = 0
    val decryptedPassword = StringBuilder()
    val number = arrayListOf<Char>()
    while ((s.length - 1) != i) {
        if (s[i].isDigit() && s[i] != '0') {
            number.add(s[i])
            i += 1
            continue
        }

        if (s[i].isUpperCase() && s[i + 1].isLowerCase()) {
            decryptedPassword.append("${s[i + 1]}${s[i]}")
            i += 3
            continue
        }

        if (s[i] == '0') {
            decryptedPassword.append(number.last())
            number.remove(number.last())
            i += 1
            continue
        } else {
            decryptedPassword.append(s[i])
            i += 1
            continue
        }
    }
    return decryptedPassword.toString()
}

fun main(args: Array<String>) {
    val s = readLine()!!

    val result = decryptPassword(s)

    println(result)
}