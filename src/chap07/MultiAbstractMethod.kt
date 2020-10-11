package chap07

interface Interface1 {
    fun funA()
}

abstract class Super1 {
    abstract fun funA()
}

class Sub1: Super1(), Interface1 {
    override fun funA() {
        println("한 번 만 Overriding")
    }
}

fun main(args: Array<String>) {
    val obj = Sub1()
    obj.funA()
}