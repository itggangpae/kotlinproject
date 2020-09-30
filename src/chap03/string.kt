package chap03

fun main(args: Array<String>) {
    var msg: String = "Hello Kotlin"
    println(msg)

    val str2="Hello \nAdam"
    val str3="""Hello
Adam"""
    println(str2)
    println(str3)

    val name: String="Adam"
    val alias: String="ITGGANGPAE"
    println("name: ${name} alias : $alias")
}