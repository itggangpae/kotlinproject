package chap05

class User {
    val num: Int = 1
        get() = field

    var name: String = "cyberadam"
        get() = field
        set(value) {field=value}
}

fun main(args: Array<String>) {
    val user=User()
    println("num : ${user.num}")
    println("name : ${user.name}")
}