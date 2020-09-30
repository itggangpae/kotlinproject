package chap03

fun main(args: Array<String>) {
    var n: Int = 10
    var optionalN: Int? = null
    println("optionalN:$optionalN")

    //n = optionalN //에러
    optionalN = n


    println("optionalN:$optionalN")
    println("n:$n")
}
