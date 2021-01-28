package chap05

open class ContraSuper

class ContraSub: ContraSuper()

class ContraClass<in T>() {

//    val myVal: T? = null//error
//    var myVal2: T? = null//error

    //    fun myFun(): T? {//error
//        return null
//    }
    fun myFun3(arg: T) { }
}

fun main(args: Array<String>) {
    val obj1 =ContraClass<ContraSub>()
    //  val obj2: ContraClass<ContraSuper> =  obj1//error

    val obj3 = ContraClass<ContraSuper>()
    val obj4: ContraClass<ContraSub> = obj3
}
