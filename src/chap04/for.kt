package chap04

fun main(args: Array<String>) {
    var sum: Int=0
    for(i in 1..10) {
        sum += i
    }
    println(sum)

    val list = listOf("JavaScript","Python", "Java", "Kotlin", "Swift")
    val sb=StringBuilder()
    for(str in list) {
        sb.append(str + "\t")
    }
    println(sb)

    println(list.indices)

    for (i in list.indices) {
        print("${list[i]} \t")
    }
    println()

    for ((index, value) in list.withIndex()) {
        println("the element at $index is $value")
    }

    for(i in 1 until 11 step 2){
        print("$i\t")
    }
}