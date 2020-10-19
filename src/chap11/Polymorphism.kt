package chap11

open class Super2

class Sub : Super2()

fun Super2.sayHello(){
    println("Super..sayHello()")
}
fun Sub.sayHello(){
    println("Sub..sayHello()")
}
fun some(obj: Super2){
    obj.sayHello()
}

fun main(args: Array<String>) {
    some(Sub())
}

