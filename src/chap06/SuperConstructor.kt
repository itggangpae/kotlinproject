package chap06

open class SuperCon(name: String){
    constructor(name: String, no: Int): this(name){}
}


class Sub1Con(name: String): SuperCon(name) {
    constructor(name: String, no: Int): this(name){ }
}


class Sub2Con: SuperCon{
    constructor(name: String): super(name){ }
    constructor(name: String, no: Int): super(name, no){}
}

fun main(args: Array<String>) {
    val sub1=Sub1Con("name", 10)
    val sub2=Sub2Con("name", 10)
}