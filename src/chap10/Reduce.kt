package chap10

fun main(args: Array<String>) {
    val list = listOf<Int>(12, 8, 9, 20)
    println("reduce sum:${list.reduce({total, next -> total + next})}")
    println("fold sum:${list.fold(1, {total, next -> total + next})}")
    println("reduceRight sum:${list.reduce({next, total -> total + next})}")
    println("foldRight sum:${list.fold(1, {next, total -> total + next})}")
}