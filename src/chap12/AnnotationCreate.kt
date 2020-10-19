package chap12

//어노테이션 생성
annotation class TestAnnotation

class Test {
    //어노테이션 설정
    @TestAnnotation
    fun myFun1() { }
    fun myFun2() { }
}

fun main(args: Array<String>) {

    val methods = Test::class.java!!.methods

    for(method in methods){
        val methodName = method.name
        //어노테이션이 있는 메소드만 출력
        if(method.isAnnotationPresent(TestAnnotation::class.java)){
            println("$methodName function has TestAnnotation annotation...")
        }
    }
}