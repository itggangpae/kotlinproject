package chap03

fun main(args: Array<String>) {

    var a = 5
    //true 이면 수행하고 그렇지 않으면 아무것도 하지 않음
    if (a < 10)
        println("$a < 10")

    a = 20
    //true 인 경우 와 false 인 경우 다른 문장 수
    if (a < 10)
        println("작은 수")
    else
        println("큰 수")

    //2개의 조건
    if(a in 1..10) {
        println("0 < $a <= 10")
    } else if(a in 11..20){
        println("10 < $a <=20")
    }else {
        println("$a > 20")
    }

    //if를 이용한 대입
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

    val result3 = if(a > 10) 20
    else if(a > 20) 30
    else 10
    println(result3)
}