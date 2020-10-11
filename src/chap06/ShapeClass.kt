package chap06

//상속가능한 ShapeSuper 클래스
open class ShapeSuper {
    var x: Int = 0
        set(value) {
            if(value < 0) field = 0
            else field = value
        }

    var y: Int = 0
        set(value) {
            if(value < 0) field = 0
            else field = value
        }

    lateinit var name: String

    fun print() {
        println("$name : location : $x, $y")
    }
}

//ShapeSuper 클래스를 상속받는 Rect 클래스
class Rect: ShapeSuper()  {
    var width: Int = 0
        set(value) {
            if(value < 0) field = 0
            else field = value
        }
    var height: Int = 0
        set(value) {
            if(value < 0) field = 0
            else field = value
        }
}

//ShapeSuper 클래스를 상속받는 Circle 클래스
class Circle: ShapeSuper() {
    var r: Int = 0
        set(value) {
            if(value < 0) field = 0
            else field = value
        }
}


fun main(args: Array<String>) {
    val rect=Rect()
    rect.name="Rect"
    rect.x=10
    rect.y=10
    rect.width=20
    rect.height=20
    rect.print()

    val circle=Circle()
    circle.name="Circle"
    circle.x=30
    circle.y=30
    circle.r=5
    circle.print()
}