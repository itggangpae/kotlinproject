package chap10

fun main(args: Array<String>) {
    val list = listOf<Int>(12, 8, 23, 9, 20, 17)
    var result = list.drop(3)
    println("앞에서 3개 제거:$result")

    result = list.dropLast(3)
    println("뒤에서 3개 제거:$result")

    result = list.dropWhile {it < 20}
    println("앞에서 20보다 크거나 같은 데이터를 만날때 까지 제거:$result")

    result = list.dropLastWhile {it < 20}
    println("에서 20보다 크거나 같은 데이터를 만날때 까지 제거:$result")


}