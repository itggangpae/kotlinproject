package chap02

fun overloading(alias: String){
    println("overloading(alias: String) call....")
}
fun overloading(num: Int){
    println("overloading(num: Int) call....")
}
fun overloading(num: Int, alias: String){
    println("overloading(a: Int, b: String) call....")
}

fun mainDisp(alias: String = "itstudy", num: Int){
    println("Hello!! " + alias)
}

fun main(args: Array<String>) {
    overloading("itstudy")
    overloading(1)
    overloading(1, "itstudy")

    mainDisp("ggangpae1", 1)
    mainDisp(num=2)
    mainDisp(alias="itstudy", num=3)
    mainDisp(num=4, alias="itggangpae")
}