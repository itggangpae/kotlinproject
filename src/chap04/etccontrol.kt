package chap04

fun main(args: Array<String>) {
    var x2=0
    var sum2=0
    while(true){
        sum2 += ++x2
        if(x2 == 10) break
    }
    println(sum2)

    aaa@ for (i in 1..3) {
        for (j in 1..3) {
            if (j>1) break@aaa
            println("i : $i , j : $j")
        }
    }
}