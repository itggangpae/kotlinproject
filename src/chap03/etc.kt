package chap03

fun main(args: Array<String>) {
    var sum=0
    //1부터 10까지 홀수의 합
    for(i in 1..10 step 2){
        sum += i
    }
    println(sum)
    //5가 1부터 10까지에 속하는지 확인
    println("5 in 1..10 : ${5 in 1..10}")

    var data3 : Int? = null
    //data3이 null이면 10
    val data4 = data3 ?: 10
    println(data4)

    data3 = 100
    val data5 = data3 ?: 10
    println(data5)

}