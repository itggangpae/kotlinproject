package chap13

typealias MyInt = Int
typealias MList<T> = MutableList<T>
typealias MC = MyClass
typealias MI = MyInterface

interface MyInterface
class MyClass: MI

typealias MyType = (Int) -> Boolean
val myFun: MyType = { it > 10 }

class Super {
    inner class Sub

    fun getSubInsance(): MySub {
        return Sub()
    }
}

typealias MySub = Super.Sub

fun main(args: Array<String>) {
    val no: MyInt = 10
    val list: MList<String> = mutableListOf("Hello","Adam")
    val obj: MC = MC()
}