package chap06
open class Super1{
    val superData: Int = 10
    fun superFun() {
        println("superFun....")
    }
}

class Sub1:Super1() {
    fun disp(){
        println("출력")
    }
}

fun Sub1.subFun() {
    println("subFun.....")
    disp()
    //super.superFun() //error
}