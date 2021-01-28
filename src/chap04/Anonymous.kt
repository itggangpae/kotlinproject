package chap04

class AnonymousOuter {

    private var no: Int = 0

    //외부 클래스에서 접근할 수 있도록 private을 추가해서 생성
    private val anonymousInner = object {
        val name: String = "adam"
        fun innerFun(){
            println("innerFun....")
            //외부 클래스의 멤버에는 접근 가능
            no++
        }
    }

    fun outerFun(){
        anonymousInner.name
        anonymousInner.innerFun()
    }
}

fun main(args: Array<String>) {
    val obj=AnonymousOuter()
    //obj.anonymousInner.name //myInner가 private 이므로 외부에서 인스턴스를 이용해서 접근할 수 없음
}
