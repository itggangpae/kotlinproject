package chap06

open class SuperClass {
    open var x: Int = 10
    open fun someFun(){
        println("Suer... someFun()")
    }
}
class SubClass : SuperClass() {
    override var x: Int = 20
    override fun someFun() {
        super.someFun()
        println("Sub... ${super.x} .... $x")
    }
}

fun main(args: Array<String>) {
    var subClass=SubClass()
    subClass.someFun()
}
