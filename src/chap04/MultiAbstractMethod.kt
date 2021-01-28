package chap04

interface Inter1 {
    fun funA()
}

interface Inter2 {
    fun funA() {
        println("Inter2")
    }
}

interface Inter3 {
    fun funA() {
        println("Inter3")
    }
}
abstract class Super1 {
    abstract fun funA()
}

open class Sub1: Super1(), Inter1, Inter2{
    override fun funA() {
        super.funA()
        println("한 번만 오버라이딩")
    }
}

fun main(args: Array<String>) {
    val obj = Sub1()
    obj.funA()
}