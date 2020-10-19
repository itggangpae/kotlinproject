package extern

import chap11.ExternTest
import chap11.data2

fun main(args: Array<String>) {
    val obj: ExternTest = ExternTest()
    println("data2 : ${obj.data2}")
}