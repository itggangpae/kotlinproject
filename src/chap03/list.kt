package chap03

fun main(args: Array<String>) {
    val mutableList = mutableListOf("Oracle", "MySQL", "MongoDB")
    println(mutableList.get(1))
    mutableList.set(1, "Maria DB") //변경하는 것이 가능
    println(mutableList.get(1))
    mutableList.add("SQLite") //데이터를 추가하는 것이 가능
    println(mutableList.count())

    val list = listOf("Java", "Kotlin")
    println(list.get(0)) //가져오는 것은 가능하지만 add 나 set은 존재하지 않음

    var arrayList : ArrayList<String> = ArrayList()
    arrayList.add("HTML")
    arrayList.add("CSS")
    arrayList.add("JavaScript")
    println(arrayList)
}