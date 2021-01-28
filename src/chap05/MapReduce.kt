package chap05
fun main(args:Array<String>) {
    val array = arrayOf(10, 20, 15, 22, 8)
    //x가 10보다 큰 데이터만 골라서 출력
    array.filter { x -> x > 10 }
        .forEach { x -> println(x) }
}