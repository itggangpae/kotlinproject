package chap04

abstract class AbstractStarcraft{
    abstract fun attack()
}

final class AbstractProtoss : AbstractStarcraft(){
    override fun attack() {
        println("프로토스의 공격")
    }
}

final class AbstractZerg : AbstractStarcraft(){
    override fun attack() {
        println("저그의 공격")
    }
}

final class AbstractTerran : AbstractStarcraft(){
    override fun attack() {
        println("테란의 공격")
    }
}

fun main(args: Array<String>) {
    //var star : AbstractStarcraft = AbstractStarcraft()
    var star : AbstractStarcraft? = null

    star = AbstractProtoss()
    star.attack()

    star = AbstractZerg();
    star.attack()

    star = AbstractTerran();
    star.attack()
}