package chap04

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

    //지연 초기화
    lateinit var address:String

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
    user.address = "서울시 양천구 목동"
}