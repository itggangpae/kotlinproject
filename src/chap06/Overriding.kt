package chap06

open class ShapeOverride {
    open fun disp() {
        println("최상위 메소드")
    }
}

open class RectOverride: ShapeOverride()  {
    override fun disp() {
        println("처음 재정의한 메소드")
    }
}

class RoundRectOverride: RectOverride() {
    override fun disp() {
        println("마지막으로 재정의한 메소드")
    }
}

fun main(args: Array<String>) {
   val roundRectOverride = RoundRectOverride()
    roundRectOverride.disp()
}
