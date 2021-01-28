package chap06

fun myFun(): Unit { }

class NothingClass<T>

fun someFun(arg: NothingClass<in Nothing>){ }


fun main(args: Array<String>) {
    //java의 void 이면 에러 Unit은 에러 아님
    println(myFun())
    someFun(NothingClass<Int>())
    someFun(NothingClass<String>())
    someFun(NothingClass<String?>())
}