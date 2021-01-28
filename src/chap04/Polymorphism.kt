package chap04

open class Starcraft{
    open fun attack(){}
}

final class Protoss : Starcraft(){
    override fun attack() {
        super.attack()
        println("프로토스의 공격")
    }
}

final class Zerg : Starcraft(){
    override fun attack() {
        super.attack()
        println("저그의 공격")
    }
}


final class Terran : Starcraft(){
    override fun attack() {
        super.attack()
        println("테란의 공격")
    }
}

fun main(args: Array<String>) {
    var star : Starcraft = Starcraft()

    star = Protoss()
    star.attack()

    star = Zerg();
    star.attack()

    star = Terran();
    star.attack()
}
