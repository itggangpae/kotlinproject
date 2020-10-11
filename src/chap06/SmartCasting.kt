package chap06

internal fun smartCast(data: Any): Int{
    //val result = data * data //이 문장은 에러

    //data 가 Int 로 형 변환 됨
    if(data is Int) return data*data
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

//인스턴스도 형 변환 됨
fun smartCast2(obj: Any){
    if(obj is MyClass1) obj.fun1()
    else if(obj is MyClass2) obj.fun2()
}

open class SuperSmart

class SubSmart: SuperSmart(){
}

fun main(args: Array<String>) {

    //숫자 데이터 사이의 형 변환
    val data1: Int = 10
    val data2: Double = data1.toDouble()

    println("result : ${smartCast(10)}")
    println("result : ${smartCast(10.0)}")

    smartCast2(MyClass1())
    smartCast2(MyClass2())

    //상위 클래스의 참조형 변수에 하위 클래스의 인스턴스 대입 가능
    val obj1: SuperSmart = SubSmart()

    //val obj2: SubSmart = SuperSmart()//error
}