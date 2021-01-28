package chap03
//일반적인 함수 선언
fun sum(a: Int, b: Int): Int {
    var sum = a + b
    return sum
}

//함수 선언
fun outerSum(a: Int, b: Int): Int {
    var sum=0
    //내부 함수 선언
    fun innerSum(){
        for(i in a..b){
            sum += i
        }
    }
    innerSum()
    return sum
}

//entry point
fun main(args: Array<String>) {
    var result=sum(1, 10)
    println(result)
    result=outerSum(1, 10)
    println(result)
    println(add1(100, 200))
    println(add2(100, 200))
    println(add3(100, 200))
}


//단일 표현 함수
fun add1(a: Int, b: Int): Int{
    return a + b
}

fun add2(a: Int, b: Int): Int = a  + b

fun add3(a: Int, b: Int) = a  + b
