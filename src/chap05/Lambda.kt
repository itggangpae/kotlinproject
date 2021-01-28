package chap05

fun funAdd(x1: Int, x2: Int): Int {
    return x1+x2
}

val lambdaAdd={ x1: Int, x2: Int -> x1+x2 }

fun main(args: Array<String>) {
    val result1 = funAdd(10, 20)
    val result2 = { x1: Int, x2: Int -> x1+x2 }(10, 20)
    val result3 = lambdaAdd(10, 20)

    println("함수 호출:$result1")
    println("람다 표현식을 작성하고 바로 호출:$result2")
    println("변수에 대입한 후 람다 호출:$result3")

    println("run:${
        run{{ x1: Int, x2: Int -> x1+x2 }(10, 20)}
    }")
}