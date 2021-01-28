package chap05

fun some1(arg: List<Int>){
    if(arg is List<Int>){
        println(arg.sum())
    }
}

fun some2(arg: List<*>){
//    if(arg is List<Int>){ //error
//
//    }
}

fun some3(arg: List<*>){
    val intList = arg as List<Int>
    println(intList.sum())
}

inline fun <reified T> some(arg: Any){
    if(arg is T){
        println("true")
    }else {
        println("false")
    }
}

fun main(args: Array<String>) {
    some3(listOf(10, 20))
    //some3(listOf("itggangpae", "adam")) //예외 발생

    some<String>("itggangpae")
    some<Int>("adam")
}