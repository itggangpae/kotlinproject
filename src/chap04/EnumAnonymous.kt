package chap04

enum class AnonyDirection {
    NORTH {
        override val data1: Int = 10
        override fun myFun(){
            println("north myFun....")
        }
    },
    SOUTH {
        override val data1: Int = 20
        override fun myFun(){
            println("south myFun....")
        }
    };

    abstract val data1: Int
    abstract fun myFun()
}

fun main(args: Array<String>) {
    val direction: AnonyDirection = AnonyDirection.NORTH
    println(direction.data1)
    direction.myFun()
}