package chap08

class OuterInner {
    private var no: Int = 10
    fun outerFun() {
        println("outerFun()...")
    }
    inner class Nested {
        val name: String = "kkang"
        fun myFun(){
            println("Nested.. myFun...")
            no=20
            outerFun()
        }
    }

    fun createNested(): Nested {
        return Nested()
    }
}

fun main(args: Array<String>) {
    //val obj: OuterInner.Nested = OuterInner.Nested() //에러 외부 클래스의 인스턴스를 생성하고 내부 클래스의 인스턴스를 생성해야 함

    val obj1: OuterInner.Nested = OuterInner().Nested()
    obj1.myFun()
    val obj2: OuterInner.Nested = OuterInner().createNested()
    obj2.myFun()
}