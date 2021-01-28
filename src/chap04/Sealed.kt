package chap04

sealed class Shape(){
    //내부 클래스로 하위 클래스를 생성
    class Circle(val radius: Double) : Shape()
    class Rect(val width: Int, val height: Int) : Shape()
}
//외부에 하위 클래스를 생성
class Triangle(val bottom: Int, val height: Int): Shape()


fun main(args: Array<String>) {
    //val shape : Shape = Shape() //에러 abstract가 없지만 추상 클래스이므로 인스턴스 생성 안됨
    val shape1: Shape = Shape.Circle(10.0)
    val shape2: Shape = Triangle(10, 10)
}
