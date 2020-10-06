package chap05

val upperData: String by lazy {
    println("최상위 레벨의 lazy init")
    "지연 생성"
}

class UserInitializer {
    var num : Int

    val name: String by lazy {
        println("클래스 내부의 프로퍼티 lazy init")
        "adam"
    }

    init {
        println("초기화 블록")
        num = 1
    }
}

fun main(args: Array<String>) {

    val user = UserInitializer()
    println("name use before...")
    println("name : ${user.name}")
    println("name use after....")
}