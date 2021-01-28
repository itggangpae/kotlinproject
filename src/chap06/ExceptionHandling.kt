package chap06

fun main(args: Array<String>) {
    try {
        val data: String = "adam"
        //예외 발생
        val intData: Int? = data.toInt()
        println("try bottom...")
    }catch (e: Exception){
        println("catch.....")
        println("예외 메시지:${e.localizedMessage}")
    }
    finally {
        println("예외 발생 여부에 상관없이 수행")
    }
    println("계속 수행")
}