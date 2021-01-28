package chap05

fun main(args: Array<String>) {
    //val list1: MutableList<Any?> = mutableListOf<Any>(10, 10.0, "adam")//error
    //list1.forEach{ println(it)}

    val list2: MutableList<*> = mutableListOf<Any>(10, 10.0, "adam")
    list2.forEach{ println(it)}
}