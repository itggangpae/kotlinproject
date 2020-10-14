package chap09

fun Outer() : () -> Unit{
    var n : Int = 1
    return {
        n = n + 1
        println(n)
    }
}

fun main(args:Array<String>){
   val inner = Outer()
   inner()
   inner()
}