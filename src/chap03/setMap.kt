package chap03

fun main(args: Array<String>) {
    var set = mutableSetOf("Spring","Hibernate", "Hibernate")
    println(set)
    set.add("JPA")
    println(set)

    var map = mutableMapOf(Pair("Language", "Kotlin"),Pair("IDE", "Intelli J"))
    println(map)
    map.put("DB", "Oracle")
    println(map.get("Language"))
    println(map.get("Mobile"))
}