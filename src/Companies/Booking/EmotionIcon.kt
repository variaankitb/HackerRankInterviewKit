package Companies.Booking

import java.util.*

class EmoticonParser {

    fun parseEmoticons(text: String): List<InlinedEmoticon> {

        val listOfEmoticon = arrayListOf<InlinedEmoticon>()
        var i = 0
        while (i < text.length) {
            if (text[i] == ':') {
                when (text[i + 1]) {
                    ')' -> {
                        val inlinedEmoticon = InlinedEmoticon(emoticonId = 1, position = i, length = 2)
                        listOfEmoticon.add(inlinedEmoticon)
                        i += 2
                    }
                    '-' -> {
                        when (text[i + 2]) {
                            ')' -> {
                                val inlinedEmoticon = InlinedEmoticon(emoticonId = 1, position = i, length = 3)
                                listOfEmoticon.add(inlinedEmoticon)
                                i += 3
                            }
                            '(' -> {
                                val inlinedEmoticon = InlinedEmoticon(emoticonId = 1, position = i, length = 3)
                                listOfEmoticon.add(inlinedEmoticon)
                                i += 3
                            }
                        }
                    }
                    '/' -> {
                        val inlinedEmoticon = InlinedEmoticon(emoticonId = 1, position = i, length = 2)
                        listOfEmoticon.add(inlinedEmoticon)
                        i += 2
                    }
                    '(' -> {
                        val inlinedEmoticon = InlinedEmoticon(emoticonId = 1, position = i, length = 2)
                        listOfEmoticon.add(inlinedEmoticon)
                        i += 2
                    }
                    else -> {
                        i += 1
                    }
                }
            } else {
                i += 1
            }
        }

        return listOfEmoticon

        //TODO Implement
        throw UnsupportedOperationException("Parsing not implemented")
    }
}

data class InlinedEmoticon(val emoticonId: Int, val position: Int, val length: Int)

// Emoticons
// :)  -> 1
// :-) -> 1
// :/  -> 2
// :(  -> 3
// :-( -> 3
fun main(args: Array<String>) {
    val text = Scanner(System.`in`).nextLine()
    val parser = EmoticonParser()
    val emoticons = parser.parseEmoticons(text)
    if (emoticons.isEmpty()) {
        println("No emoticons found")
        return
    }
    for (emoticon in emoticons) {
        println(emoticon.emoticonId.toString() + " " + emoticon.position + " " + emoticon.length)
    }
}