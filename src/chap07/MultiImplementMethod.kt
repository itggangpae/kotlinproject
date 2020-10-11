package chap07

interface Interface2 {
    fun funA() {
        println("Interface2 funA...")
    }
}
interface Interface3 {
    fun funA() {
        println("Interface3 funA...")
    }
}

class Sub2: Interface2, Interface3 {
    override fun funA() {
        super<Interface2>.funA()
        super<Interface3>.funA()
    }
    fun some(){
        super<Interface2>.funA()
    }
}

fun main(args: Array<String>) {
    val obj = Sub2()
    obj.funA()
    obj.some()
}