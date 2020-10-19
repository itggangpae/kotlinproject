package chap11

class Super1 {
    val superData: Int = 10
    fun superFun() {
        println("superFun....")
    }
}

fun Super1.subFun() {
    println("subFun.....")
    //super.superFun() //error
}