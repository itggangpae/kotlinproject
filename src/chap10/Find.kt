package chap10

fun main(args: Array<String>) {
    val redvelvel = listOf<String>("아이린", "조이", "슬기", "웬디", "예리")
    println("조이는 레드벨벳:${redvelvel.contains("조이")}")
    println("제니는 레드벨벳:${redvelvel.contains("제니")}")

    println("레드벨벳의 리더:${redvelvel.elementAt(0)}")
    println("레드벨벳의 막내:${redvelvel.elementAtOrNull(5)}")
    println("레드벨벳의 막내:${redvelvel.elementAtOrElse(5, {"멤버는 5명"})}")

    var result = list.first{it.score >= 95}
    println("95점이 넘는 첫번째 데이터:${list.first{it.score >= 95}.name}")
    println("95점이 넘는 마지막 데이터:${list.last{it.score >= 95}.name}")
    println("100점이 넘는 데이터:${list.firstOrNull{it.score > 100}}")

    println("레드벨벳에서 아이린의 위치:${redvelvel.indexOf("아이린")}")
    println("레드벨벳에서 지수의 위치:${redvelvel.indexOf("지수")}")

    println("98점이 넘는 데이터의 첫번째 위치:${list.indexOfFirst{it.score > 98}}")
    println("98점이 넘는 데이터의 마지막 위치:${list.indexOfLast{it.score > 98}}")
}