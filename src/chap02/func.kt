package chap02

//함수 선언
fun sum(a: Int, b: Int): Int {
    var sum=0
    //내부 함수 선언
    fun calSum(){
        for(i in a..b){
            sum += i
        }
    }
    calSum()
    return sum
}

//단일 표현 함수
fun add1(a: Int, b: Int): Int{
    return a + b
}

fun add2(a: Int, b: Int): Int = a  + b

fun add3(a: Int, b: Int) = a  + b

//entry point
fun main(args: Array<String>) {
    val result=sum(1, 10)
    println(result)
    println(add1(100, 200))
    println(add2(100, 200))
    println(add3(100, 200))
}
