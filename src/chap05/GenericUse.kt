package chap05

class MyClass1<T> {
    var info: T? = null
}

class MyClass2<T>(no: T){
    var info: T? = null
}

class MyClass3<AA> {
    var info: AA? = null
}

fun main(args: Array<String>) {
    val ar = arrayOf<String>("제니", "지수", "로제", "리사")

    val obj1=MyClass1<String>()
    obj1.info="hello"

    val obj2=MyClass1<Int>()
    obj2.info=10

    val obj3=MyClass2<Int>(10)
    obj3.info=20

    //타입 유추가 가능하면 타입을 기재하지 않아도 가능
    val obj4=MyClass2("hello")
    obj4.info="world"
}