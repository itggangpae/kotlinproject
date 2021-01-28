package chap03

fun main(args: Array<String>) {
    val data3=10
    val data4=5.9
    println(data3 + data4)
    println(data3 - data4)
    println(data3 * data4)
    println(data3 / data4)
    println(data3 % data4)

    var sum : Double = 0.0
    //sum 에 0.1을 1000번 더함
    for(i in 1..1000){
        sum = sum + 0.1
    }
    println("sum:${sum}") //결과가 100이 아님

    //0.2 와 1.0 - 0.8은 같은지 ? 결과는 false
    println(0.2 == 1.0-0.8)
}