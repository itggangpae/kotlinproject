package chap03

//함수 오버로딩
fun overloading(alias: String){
    println("overloading(alias: String) call....")
}
fun overloading(num: Int){
    println("overloading(num: Int) call....")
}
fun overloading(num: Int, alias: String){
    println("overloading(a: Int, b: String) call....")
}

//매개변수의 기본값 설정
fun mainDisp(alias: String = "itstudy", num: Int){
    println("Hello!! " + alias)
}

fun main(args: Array<String>) {
    overloading("itstudy")
    overloading(1)
    overloading(1, "itstudy")

    mainDisp("ggangpae1", 1)
    //매개변수에 이름을 대입해서 호출
    mainDisp(num=2)
    mainDisp(alias="itstudy", num=3)
    mainDisp(num=4, alias="itggangpae")
}