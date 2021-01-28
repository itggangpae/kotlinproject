package chap04

fun smartCast(data: Any): Int{
    //val result = data * data //이 문장은 에러

    //data 가 Int 로 형 변환 됨
    if(data is Int) return data * data
    else return 0
}

class MyClass1 {
    fun fun1(){
        println("fun1()...")
    }
}
class MyClass2 {
    fun fun2(){
        println("fun2()...")
    }
}

fun smartCast2(obj: Any){
    if(obj is MyClass1) obj.fun1()
    else if(obj is MyClass2) obj.fun2()
}

open class SuperSmart

class SubSmart: SuperSmart(){
}

fun main(args: Array<String>) {

    //기본형 데이터 사이의 형 변환
    val data1: Int = 10
    val data2: Double = data1.toDouble()

    println("result : ${smartCast(10)}")
    println("result : ${smartCast(10.0)}")

    smartCast2(MyClass1())
    smartCast2(MyClass2())

    //상위 클래스의 참조형 변수에 하위 클래스의 인스턴스 대입 가능
    val obj1: SuperSmart = SubSmart()
    //val obj2: SubSmart = SuperSmart() //에러

    //상위 클래스 타입으로 만들어진 데이터를 하위 클래스 타입의 변수에 대입할 때는 강제 형 변한을 수행해야 함
    val obj2: SubSmart = obj1 as SubSmart
    //val obj3 = SuperSmart() as SubSmart //에러는 아니지만 예외 발생
}