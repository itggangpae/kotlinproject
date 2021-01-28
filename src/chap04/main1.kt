package chap04

fun main(args: Array<String>) {
    //MyClass 클래스의 인스턴스를 생성해서 참조를 obj1 에 저장
    val obj1 = MyClass()
    //obj1 의 참조를 출력
    println(obj1)
    //인스턴스를 통해서 속성 호출
    println(obj1.myVariable)
    //인스턴스를 통해서 함수 호출
    obj1.myFunction()

    //MyClass 클래스의 인스턴스를 생성해서 참조를 obj2 에 저장
    val obj2 = MyClass()
    println(obj2)
}