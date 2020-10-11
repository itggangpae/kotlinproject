package chap05

class MethodClass {
    fun myFunction(){
        println("메소드")
    }

    fun innerCall(){
        //객체 설정없이 호출
        myFunction()
        //this를 이용한 호출
        this.myFunction()
    }
}

fun main(args: Array<String>) {
    val methodClass=MethodClass()

    methodClass.myFunction()
    methodClass.innerCall()
}