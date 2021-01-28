package chap03

fun main(args: Array<String>) {
    var sum: Int=0
    //1부터 10까지 더하기
    for(i in  1 .. 10) {
        sum += i
    }
    println(sum)

    //목록 순회
    val list = listOf("JavaScript","Python", "Java", "Kotlin", "Swift")
    val sb=StringBuilder()
    for(str in list) {
        sb.append(str + "\t")
    }
    println(sb)

    //인덱스 순회
    println(list.indices)

    for (i in list.indices) {
        print("${list[i]} \t")
    }
    println()

    //인덱스와 목록 순회
    for ((index, value) in list.withIndex()) {
        println("the element at $index is $value")
    }

    //마지막 숫자 제외한 순회
    for(i in 1 until 11 step 2){
        print("$i\t")
    }
}