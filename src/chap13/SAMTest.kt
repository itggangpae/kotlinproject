package chap13

fun main(args: Array<String>) {
    val obj=SAMTest()

    obj.setInterface(object : JavaInterface1{
        override fun callback() {
            println("hello kotlin")
        }
    })

    obj.callback.callback()
    obj.setInterface { println("hello sam") }
    obj.callback.callback()
}
