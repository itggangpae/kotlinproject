package chap11

class ExternTest {
    val data1: Int = 10
}

val ExternTest.data2
    get() = 20

fun main(args: Array<String>) {
    val obj: ExternTest = ExternTest()
    println("data2 : ${obj.data2}")
}