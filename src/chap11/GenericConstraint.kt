package chap11

class MathUtil<T: Number> {
    fun plus(arg1: T, arg2: T): Double {
        return arg1.toDouble() + arg2.toDouble()
    }
}

interface MyInterface1
interface MyInterface2

class MyHandler1: MyInterface1, MyInterface2

class MyHandler2: MyInterface1

class  MyClass<T> where T: MyInterface1, T: MyInterface2{

}

class MyClassNotNull<T: Any> {
    fun myFun(arg1: T, arg2: T){
        println(arg1.equals(arg2))
    }
}

fun main(args: Array<String>) {
    val obj = MathUtil<Int>()
    obj.plus(10, 20)
    val obj1 = MathUtil<Double>()
    //val obj2 = MathUtil<String>()//error

    val obj3 = MyClass<MyHandler1>()
    //val obj4 = MyClass<MyHandler2>()//error

    val obj5 = MyClassNotNull<String>()
    obj5.myFun("hello", "hello")

    //val obj6 = MyClassNotNull<Int?>()//error
    //obj6.myFun(null, 10)
}