package chap03

fun sum(n: Int): Int {
    if (n <= 0)
        return n
    else
        return n + sum(n - 1)
}
fun fibo(n:Int):Int{
    var n2 = 1
    var n1 = 1
    var f = 1
    for (i in 3..n){
        f = n2 + n1
        n2 = n1
        n1 = f
    }
    return f
}
fun fibo1(n:Int): Int{
    if(n == 1 || n == 2)
        return 1
    else
        return fibo1(n-1) + fibo1(n-2)
}

tailrec fun fibo2(n:Int): Int{
    if(n == 1 || n == 2)
        return 1
    else
        return fibo1(n-1) + fibo1(n-2)
}

fun main(args: Array<String>) {
    println(sum(3))
    println(fibo(30))
    println(fibo1(30))
    println(fibo2(30))
}