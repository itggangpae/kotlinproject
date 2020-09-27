package chap02

//Int 클래스 학장
infix fun Int.myFunc(x: Int): Int {
    return x * x
}

//클래스 생성
class FuncClass {
    infix fun infixFunc(a: Int){
        println("infixFun call....")
    }
}

fun <T> varargsFunc(a1: Int, vararg array: T){
    for( a in array){
        println(a)
    }
}

fun main(args: Array<String>) {
    //객체 생성
    val obj=FuncClass()
    //일반적인 호출
    obj.infixFunc(10)
    println(10.myFunc(10))

    //중위 표현식 호출
    obj infixFunc 10
    println(10 myFunc 10)

    varargsFunc(10, "itstudy", "ggangpae1")
    varargsFunc(10, "age", 50)
}
