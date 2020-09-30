package chap04

fun main(args: Array<String>) {
    var idx : Int = 1
    var fac : Int = 1
    while(idx <= 10){
        idx = idx + 1
        fac = fac * idx
    }
    println("factorial:$fac")

    var f2 : Int = 1
    var f1 : Int = 1
    var fibo : Int = 1
    idx = 3
    do{
        fibo = f2 + f1
        f2 = f1
        f1 = fibo
        idx = idx + 1
    }while(idx <= 10)
    println("fibo:$fibo")

}