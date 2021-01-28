package chap04

//top-level시 접근제한자
val myData1: Int = 10

private val myData2: String = "hello"

internal fun myFun1() {
    println("myFun() call..")
}

private fun myFun2(){
    println("myFun() call..")
}

fun main(args: Array<String>) {
    //top-level시 접근제한자
    println("$myData1 .. ")
    println("$myData2 .. ")
    myFun1()
    myFun2()
}