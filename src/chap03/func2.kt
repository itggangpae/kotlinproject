package chap03

fun <T> varargsFunc(a1: Int, vararg array: T){
    println("자료형은 배열이 맞나요 : ${array is Array}")
    for( a in array){
        println(a)
    }
}

fun main(args: Array<String>) {
    varargsFunc(10, "itstudy", "ggangpae1")
    varargsFunc(10, "age", 50)
}
