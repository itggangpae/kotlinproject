package chap04

//추상 클래스 만들고 하위에서 오버라이드에 의해 재정의
abstract class AbstractSuper {
    //일반 프로퍼티로 하위 클래스에서 오버라이딩 할 필요가 없음
    val data1: Int = 10
    //추상 프로퍼티로 하위 클래스에서 반드시 오버라이딩 해야
    abstract val data2: Int

    //일반 메소드로 하위 클래스에서 오버라이딩 하지 않아도 됨
    fun myFun1() {
    }
    //추상 메소드 - 하위 클래스에서 반드시 재정의 해야 함
    abstract fun myFun2()
}

class AbstractSub: AbstractSuper() {
    //추상 프로퍼티와 추상 메소드 오버라이딩
    override val data2: Int = 10
    override fun myFun2() {

    }
}

fun main(args: Array<String>) {
    //val obj1=AbstractSuper()//error
    val obj2=AbstractSub()
}
