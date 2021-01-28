package chap04

open class Super {
    open val name: String = "Park"
    open var age: Int = 10
    open val email: String?=null
    open val address: String="seoul"
}
open class AdamSoft: Super() {
    final override var name: String = "cyberadam"//가능
    //override val age: Int = 20//에러
    override val email: String = "ggangpae1@adamsoft.com"//가능
    //override val address: String? = null//에러
}
class TriglowPictures: AdamSoft() {
    //override var name: String = "itggangpae"//에러
}

fun main(args: Array<String>) {
    val adam = AdamSoft()
    println("${adam.name}")
}