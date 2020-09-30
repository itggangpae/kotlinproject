package chap04

fun main(args: Array<String>) {
    val data1=10
    val data2=20
    println("data1 < data2 is ${data1 < data2}")
    println("data1 < data2 is ${data1 > data2}")

    var sum=0
    //1부터 10까지
    for(i in 1..10){
        sum += i
    }
    println(sum)

    println("5 in 1..10 : ${5 in 1..10}")

    var data3 : Int? = null
    val data4 = data3 ?: 10
    println(data4)

    data3 = 100
    val data5 = data3 ?: 10
    println(data5)
}