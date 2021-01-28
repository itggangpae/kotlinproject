package chap03

fun main(args: Array<String>) {
    val a = 1
    //정수와 문자열을 이용한 when
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
    //여러 개의 값 설정
    when (data) {
        10, 20 -> println("data is 10 or 20")
        30, 40 -> println("data is 30 or 40")
        else -> println("data is not 10,20,30,40")
    }

    val jumsu = 89
    //범위 설정
    when (jumsu) {
        in 80..100 -> println("우수")
        in 60..79 -> println("보통")
        else -> println("보충 수업")
    }

    val native = listOf<String>("Java", "Kotlin", "Objective-C", "Swift")
    val hybrid = arrayOf<String>("JavaScript", "C#")
    val data4 = "Kotlin"
    //목록 이용
    when (data4) {
        in native -> println("native app 개발")
        in hybrid -> println("hybrid app 개발")
    }

    // 인수 없는 when의 사용
    print("점수 입력:")
    val score = readLine()!!.toDouble()
    var grade: Char = 'F'

    //표현식이 없는 when
    when {
        score >= 90.0 -> grade = 'A' // 인자 있는 when과 다르게 조건식 구성할 수 있음
        score in 80.0..89.9 -> grade = 'B'
        score in 70.0..79.9 -> grade = 'C'
        score < 70.0 -> grade = 'F'
    }
    println("Score: $score, Grade: $grade")
}