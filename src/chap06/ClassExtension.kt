package chap06
//상속을 통한 기능 확장
/*
open class Super {
    val superData: Int = 10
    fun superFun() {
        println("superFun....")
    }
}

class Sub: Super() {
    val subData: Int = 20
    fun subFun() {
        println("subFun....")
    }
}

fun main(args: Array<String>) {
    val obj: Sub = Sub()
    println("superData : ${obj.superData}, subData : ${obj.subData}")
    obj.superFun()
    obj.subFun()
}
*/

class SuperExt {
    val superData: Int = 10
    fun superFun() {
        println("superFun....")
    }
}

//SuperExt 클래스에 메소드와 프로퍼티 추가
val SuperExt.subData: Int
    get() = 20

fun SuperExt.subFun() {
    println("subFun.....")
}

fun main(args: Array<String>) {
    val obj: SuperExt = SuperExt()
    println("superData : ${obj.superData}, subData : ${obj.subData}")
    obj.superFun()
    obj.subFun()
}