package chap04

class MethodClass {
    fun myFunction(){
        println("메소드")
    }

    fun innerCall(){
        //내부에서 이름만으로 호출
        myFunction()
        //this를 이용한 호출
        this.myFunction()
    }
}

fun main(args: Array<String>) {
    val methodClass= MethodClass()
    //클래스 외부에서는 인스턴스를 이용해서 호출
    methodClass.myFunction()
    methodClass.innerCall()
}