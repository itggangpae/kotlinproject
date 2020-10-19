package chap11

fun main(args: Array<String>) {
    try {
        println("try top...")
        val data: String = "adam"
        val intData: Int? = data.toInt()
        println("try bottom...")
    }catch (e: Exception){
        println("catch.....")
    }
    finally {
        println("finally....")
    }
    println("계속 수행")
}