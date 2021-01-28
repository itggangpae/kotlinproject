package chap06

class Test {
    fun sayHello(){
        println("Test.. sayHello()")
    }
    companion object {
        val data1: Int = 10
        fun myFun1(){
            println("companion object myFun1()....")
        }
    }
}
//프로퍼티 확장
val Test.extensionData: Int
    get() = 10
//동일한 메소드 사용
fun Test.sayHello(){
    println("Test extension.. sayHello()")
}
fun Test.Companion.myFun2() {
    println("extension myFun2()....")
}

fun main(args: Array<String>) {
    val test=Test()
    println("extensionData : ${test.extensionData}")
    test.sayHello()
    println("data1 : ${Test.data1}")
    Test.myFun1()
}