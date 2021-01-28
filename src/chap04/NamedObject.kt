package chap04

interface SomeInterface {
    fun interfaceFun()
}
open class SomeClass {
    fun someClassFun(){
        println("someClassFun....")
    }
}

class SomeOuter {
    val someInner: SomeClass =object : SomeClass(), SomeInterface {
        override fun interfaceFun() {
            println("interfaceFun....")
        }
    }
}

object ObjectClass {
    fun myFun() {
        println("Singleton Pattern....")
    }
}

class CompanionOuter {
    companion object NestedClass {
        val no: Int = 0
        fun myFun() {println("no:$no")}
    }

    fun myFun(){
        myFun()
    }
}

fun main(args: Array<String>) {
    val obj = SomeOuter()
    obj.someInner.someClassFun()

    //val obj: ObjectClass = ObjectClass()//error
    ObjectClass.myFun()

    CompanionOuter.NestedClass.no
    CompanionOuter.NestedClass.myFun()

    CompanionOuter.myFun()
}