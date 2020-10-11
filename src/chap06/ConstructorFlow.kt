package chap06

open class SuperFlow {
    constructor(name: String, no: Int){
        println("Super ... constructor(name, no)")
    }
    init {
        println("Super ... init call....")
    }
}
class SubFlow(name: String): SuperFlow(name, 10){
    constructor(name: String, no: Int): this(name){
        println("Sub ... constructor(name, no) call")
    }
    init {
        println("Sub ... init call....")
    }
}

fun main(args: Array<String>) {

    SubFlow("cyberadam")
    println("...................................")
    SubFlow("itggangpae",10)
}