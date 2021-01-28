package chap03

import java.util.*

fun some(vararg list: String){
    val iterator=list.iterator()
    while(iterator.hasNext()){
        println(iterator.next())
    }
}

fun main(args: Array<String>) {
    val array = arrayOf("Seoul", "Kwangju", "Masan", "Mokpo", "Shinan")

    val list1= Arrays.asList(array[0], array[1], array[2], "Daejeon")
    list1.forEach({println(it)})
    println("=============")

    val list2= Arrays.asList(*array, "Nonsan")
    list2.forEach({println(it)})
    println("=============")

    some(*array)
}