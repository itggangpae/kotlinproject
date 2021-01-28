package chap05

import java.lang.StringBuilder

fun main(args:Array<String>){
    val s1 = "Kotlin"
    val s2 = "Kotlin"
    println(System.identityHashCode(s1))
    println(System.identityHashCode(s2))

    val s3 = "Kotlin/Swift".split("/")
    println(s3)
    val s4 = "Kotlin\\Swift".split("\\")
    println(s4)

    val sb = StringBuilder(s1)
    sb.append("IOS")
    sb.insert(6, ",")
    sb[7] = 'i'
    println(sb.toString())
}