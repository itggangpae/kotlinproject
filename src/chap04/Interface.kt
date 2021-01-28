package chap04

interface StarcraftInt{
    fun attack()
}

final class ProtossImpl : StarcraftInt{
    override fun attack() {
        println("프로토스의 공격")
    }
}

final class ZergImpl : StarcraftInt{
    override fun attack() {
        println("저그의 공격")
    }
}

final class TerranImpl : StarcraftInt{
    override fun attack() {
        println("테란의 공격")
    }
}

fun main(args: Array<String>) {
    var star : StarcraftInt? = null

    star = ProtossImpl()
    star.attack()

    star = ZergImpl();
    star.attack()

    star = TerranImpl();
    star.attack()

}