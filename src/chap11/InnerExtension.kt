package chap11

class ExtensionClass {
    fun some1() {
        println("ExtensionClass some1()")
    }

    fun myFun() {
        println("ExtensionClass myFun()")
    }
}

class DispatchClass {

    fun myFun() {
        println("DispatchClass myFun()")
    }

    fun ExtensionClass.some2() {
        some1()
        myFun()
        this@DispatchClass.myFun()
    }
}

fun main(args: Array<String>) {
    val obj: ExtensionClass = ExtensionClass()
    obj.some1()
    //obj.some2()//error
}
