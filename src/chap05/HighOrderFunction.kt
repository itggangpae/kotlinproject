package chap05

fun funArg(func:(Int)->Int){
    println(func(10))
}

fun add(n:Int):Int{
    return n + 10
}

fun trailingClosure(n:Int, func:(Int)->Int){
    println(func(n))
}

fun main(args:Array<String>){
    //함수를 매개변수로 대입
    funArg(::add)

    //람다 표현식을 이용함 함수 대입
    funArg({it * 10})
    //매개변수가 함수가 매개변수이고 매개변수가 1 인 경우에는 ()개 생략 가능
    funArg {it - 10}

    //마지막 매개변수만 ()에서 설
    trailingClosure(20){it - 10}
}