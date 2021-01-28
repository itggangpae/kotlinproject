package chap05
val lambda: () -> Boolean = { // 람다 표현식이 두 줄이다
    println("lambda function")
    true // 마지막 표현식 문장의 결과가 반환
}

fun disp():Boolean{
    println("Top Level function")
    return true
}

fun callByValue(b: Boolean): Boolean { // 일반 변수 자료형으로 선언된 매개변수
    println("callByValue function")
    return b
}

fun callByName(b: () -> Boolean): Boolean { // 람다식 함수 자료형으로 선언된 매개변수
    println("callByName function")
    return b()
}

fun main() {
    var result = callByValue(lambda()) // 람다식 함수로 호출
    println(result)

    result = callByName(lambda) // 람다식 이름으로 호출
    println(result)

    result = callByValue(disp()) // 함수 호출 결과를 대입
    println(result)

    result = callByName(::disp) // 함수 이름으로 호출
    println(result)
}