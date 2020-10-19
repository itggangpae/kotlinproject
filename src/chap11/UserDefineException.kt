package chap11

fun some(arg: Int): Int{
    if(arg<1)
        throw Exception("매개변수는 0보다 크거나 같아야 합니다.")
    else {
        var sum=0
        for(i in 1..arg){
            sum += i
        }
        return sum
    }
}

class MyException(msg: String): Exception(msg){
    val errorData: String = "some error data"
    fun errorFun(){
        println("errorFun call....")
    }
}

fun some1(){
    throw MyException("My Error...")
}

fun some2() {
    val name: String? = null
    val s: String = name ?: throw IllegalArgumentException("Name required")
    println("some1 bottom")
}

fun some3(arg: Int): Nothing {
    if(arg> 0)
        throw Exception("some2 exception.. arg>0 true")
    else
        throw Exception("some2 exception.. arg>0 false")
}

fun main(args: Array<String>) {
    try {
        println("${some(5)}")

        println("${some(-1)}")

        println("main bottom....")
    }catch (e: Exception){
        println("Exception.... ${e.toString()}")
    }

    try {
        some1()
    }catch (e: MyException){
        println("error message : ${e.toString()}")
        println("error data : ${e.errorData}")
        e.errorFun()
    }

    try {
        some2()
    }catch (e: Exception){
        println(e.toString())
    }

    try {
        some3(10)
    }catch (e: Exception){
        println(e.toString())
    }
}