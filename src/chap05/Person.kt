package chap05

class Person(var name : String){
    init{
        println("초기화 블록")
    }

    constructor(num : Int, name : String):this(name){
        println("Secondary Constructor: $num ... $name")
    }
}

fun main(args: Array<String>) {
    val person1 = Person("adam")
    val person2 = Person(1, "itggangpae")
}