package chap04

fun main(args: Array<String>) {
    val a = 1
    when (a) {
        1 -> println("a == 1")
        2 -> println("a == 2")
        else -> {
            println("a is neither 1 nor 2")
        }
    }

    val language = "Java"
    when (language) {
        "Java" -> println("Java is Difficult")
        "Kotlin" -> println("Kotlin is Easy")
        else -> println("language is neither Java nor Kotlin")
    }

    val data = 50
    when (data) {
        10, 20 -> println("data is 10 or 20")
        30, 40 -> println("data is 30 or 40")
        30 + 30 -> println("data is 60")
    }

    val jumsu = 89
    when (jumsu) {
        in 80..100 -> println("우수")
        in 60..79 -> println("보통")
        else -> println("보충 수업")
    }

    val native = listOf<String>("Java", "Kotlin", "Objective-C", "Swift")
    val hybrid = arrayOf<String>("JavaScript", "C#")
    val data4 = "Kotlin"
    when (data4) {
        in native -> println("native app 개발")
        in hybrid -> println("hybrid app 개발")
    }
}