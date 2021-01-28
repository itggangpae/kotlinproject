package chap04

class AnyShape {
    var x: Int = 0
    var y: Int = 0
    var name: String = "Rect"

    fun draw() {
        println("draw $name : location : $x, $y")
    }
}

fun main(args: Array<String>) {
    val obj1: AnyShape = AnyShape()
    val obj2: AnyShape = AnyShape()
    val obj3 = obj1
    //Shape에 정의하지 않은 equals 메소드 호출 - Any 로 부터 상속을 받아서 사용 가능
    println("obj1.equals(obj2) is ${obj1.equals(obj2)}")
    println("obj1.equals(obj3) is ${obj1.equals(obj3)}")
}