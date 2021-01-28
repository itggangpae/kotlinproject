package chap05

//함수 내에 변수 다른 함수 클래스를 포함할 수 있음
fun superFun(){
    val localData="지역 변수"

    fun subFun(){
        println("subFun() .. superData : ${localData}")
    }

    class SubClass {
        fun classFun(){
            println("classFun() .. superData : ${localData}")
        }
    }
    subFun()
    SubClass().classFun()
}

fun main(args: Array<String>) {
    superFun()
    val dataVal=10
    // 람다타입
    val funVal1= { x1: Int ->
        println("람다 형식 대입")
        x1 * 10
    }
    funVal1(10)

    fun someFun() {
        println("다른 함수에 대입")
    }
    val funVal2=::someFun
    funVal2()
}