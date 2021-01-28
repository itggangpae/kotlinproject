package chap05

open class CoSuper

class CoSub: CoSuper()

class CoClass<out T>(val data: T) {

    val myVal: T? = null
    //var myVal2: T? = null//error

    fun myFun(): T {
        return data
    }
    //fun myFun3(arg: T) { }//error
}

fun main(args: Array<String>) {
    val obj1 = CoClass<CoSub>(CoSub())
    val obj2: CoClass<CoSuper> = obj1

    val obj3 = CoClass<CoSuper>(CoSuper())
    //val obj4: CoClass<Sub> = obj3//error
}