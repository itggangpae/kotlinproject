package chap05

fun main(args: Array<String>) {
    val list = listOf<Int>(12, 8, 9, 20)
    var result = list.filter{ it % 2 == 0 }
    println("filter odd:$result")

    val map = mapOf<String, Int>(Pair("KIA", 50), Pair("Hanhwa", 37), Pair("Dusan", 45))
    val entry = map.filter{ it.value >= 40 }
    println("${entry.keys}")

    result = list.filterNot{ it % 2 == 0 }
    println("filter even:$result")

    val list1 = listOf<Int?>(12, 8, null)
    result = list1.filterNotNull()
    println("Not Null List:$result")
}