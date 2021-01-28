package chap05

fun main(args: Array<String>) {
    val list= listOf<Int>(12, 8, 9, 20)
    //forEach
    list.forEach { println(it)}
    list.forEachIndexed { index, value -> println("index : $index, value : $value")  }

    //all, any
    var result = list.all { it % 2 == 0 }
    println("all even:$result")

    result = list.any { it % 2 == 0 }
    println("any even:$result")

    result = list.none { it % 2 == 0 }
    println("none even:$result")

    val names= listOf<String>("adam", "ggangpae1", "itstudy", "ITggangpae")
    println(names.max())
    //단순하게 가장 작은 값을 구하기 때문에 최소값은 ITggangpae
    println(names.min())
    //모두 대문자로 변환해서 구함 - adam
    println(names.minBy({it.toUpperCase()}))

    println(list.sumBy({it}))

}