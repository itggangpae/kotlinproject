package chap10

fun main(args: Array<String>) {
    val list = listOf<String>("배유나", "문정원", "유서연", "전새얀", "하혜진", "염혜선", "한유미", "강소휘", "안혜진", "이소영")
    var result = list.slice(1..3)
    println("1~3:$result")

    result = list.take(2)
    println("앞에서 2개:$result")
    result = list.takeLast(2)
    println("뒤에서 2개:$result")

    result = list.takeWhile{it < "아"}
    println("ㅇ보다 작은 자음으로 시작하는 선수를 만날때 까지:$result")
    result = list.takeLastWhile{it < "자"}
    println("뒤에서 ㅈ보다 작은 자음으로 시작하는 선수를 만날때 까지:$result")
}