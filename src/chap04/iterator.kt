package chap04

fun main(args: Array<String>) {

    val list1= listOf<String>("Kotlin","Swift")
    val iterator1=list1.iterator()
    while (iterator1.hasNext()){
        println(iterator1.next())
    }

    val map= mapOf<String, String>("Language" to "Kotlin", "OS" to "Android")
    val iterator2: Iterator<Map.Entry<String, String>> = map.iterator()
    while (iterator2.hasNext()){
        val entry=iterator2.next()
        println("${entry.key} - ${entry.value}")
    }

    val set= setOf<String>("Oracle","MariaDB", "MongoDB", "SQLite", "FireBase")
    val iterator3=set.iterator()
    while (iterator3.hasNext()){
        println("${iterator3.next()}")
    }

    val array= arrayOf("HTML","CSS", "JavaScript")
    val iterator4=array.iterator()
    while (iterator4.hasNext()){
        println("${iterator4.next()}")
    }
}