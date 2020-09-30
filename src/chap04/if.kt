package chap04

fun main(args: Array<String>) {

    val a = 5
    if (a < 10) println("$a < 10")

    if (a > 0  && a <= 10) {
        println("0 < $a <= 10")
    } else if(a > 10 && a <= 20){
        println("10 < $a <=20")
    }else {
        println("$a > 20")
    }


    val result=if (a > 10) "Java" else "Kotlin"
    println(result)

//    if(a>10) "hello"//ok
//    val result2=if(a>10) "hello"//error

    val result2 = if (a < 10) {
        print("Java....")
        10+20
    } else {
        print("Kotlin...")
        20+20
    }
    println(result2)

    val result3 = if (a > 10) 20
    else if(a > 20) 30
    else 10
    println(result3)
}