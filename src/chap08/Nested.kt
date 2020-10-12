package chap08

class Outer {
    var score = 80
    class Nested {
        val name: String = "Adam"
        fun myFun(){
            println("Nested.. myFun...")
            //score = 90 //에러 외부 클래스의 멤버에 직접 접근이 안됨
        }
    }
}

fun main(args: Array<String>) {
    val obj: Outer.Nested = Outer.Nested()
    println("${obj.name}")
    obj.myFun()
}