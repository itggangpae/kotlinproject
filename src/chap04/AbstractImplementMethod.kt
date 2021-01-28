package chap04

interface Interface4 {
    fun funA()
}
interface Interface5 {
    fun funA() {
        println("Interface5 funA...")
    }
}

class Sub3: Interface4, Interface5 {
    override fun funA() {
        super.funA()
        println("추가 구현하는 내용")
    }
}

fun main(args: Array<String>) {
    val obj = Sub3()
    obj.funA()
}