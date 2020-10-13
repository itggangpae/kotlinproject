package chap09

fun funAdd(x1: Int, x2: Int): Int {
    return x1+x2
}

val lambdaAdd={ x1: Int, x2: Int -> x1+x2 }

fun main(args: Array<String>) {
    val result1 = funAdd(10, 20)
    val result2 = lambdaAdd(10, 20)

    println("함수 호출:$result1")
    println("람다 호출:$result2")
}