package chap03

import java.util.ArrayList
import java.util.HashMap

fun main(args: Array<String>) {
    val javaList: ArrayList<String> = ArrayList()
    javaList.add("Language")
    javaList.add("Database")
    println(javaList)

    val javaMap: HashMap<String, String> = HashMap()
    javaMap.put("Language", "Kotlin")
    javaMap.put("Database", "Firebase")
    println("${javaMap.get("Language")} .. ${javaMap.get("Database")}")
}