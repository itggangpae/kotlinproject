package chap05

import java.util.*
import kotlin.collections.HashMap
import kotlin.collections.LinkedHashMap

fun main(args:Array<String>) {
    // java.util.HashMap의 사용
    val hashMap: HashMap<String, String> =
        hashMapOf("OS" to "Mac OS", "Languge" to "Kotlin", "IDE" to "Intelli J")
    println("hashMap = ${hashMap}")

    // java.util.SortedMap 사용
    val sortedMap: SortedMap<String, String> = sortedMapOf("OS" to "Mac OS", "Languge" to "Kotlin", "IDE" to "Intelli J")
    println("sortedMap = $sortedMap")

    // java.util.LinkedHashMap의 사용
    val linkedHash: LinkedHashMap<String, String> = linkedMapOf("OS" to "Mac OS", "Languge" to "Kotlin", "IDE" to "Intelli J")
    println("linkedHash = $linkedHash")

    val langMap: Map<String, Any> = mapOf(
        "os" to "C&C++", "web" to "JavaScript",
        "android" to "Java, Kotlin", "iOS" to "Objective-C, Swift",
        "datascience" to "R, Python", "bigdata" to "scala"
    )
    for ((key, value) in langMap) { // 키와 값의 쌍을 출력
        println("key=$key, value=$value")
    }
    println("langMap[android] = ${langMap["android"]}") // 키 android 대한 요소 출력
    println("langMap.get(iOS) = ${langMap.get("iOS")}") // 위와 동일한 표현
    println("langMap.keys = ${langMap.keys}") // 맵의 모든 키 출력
}