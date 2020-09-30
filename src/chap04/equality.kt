package chap04

fun main(args: Array<String>) {
    class User
    val user1=User()
    val user2=User()
    val user3=user1
    println("user1==user2 is ${user1==user2}")//false
    println("user1===user2 is ${user1===user2}")//false
    println("user1==user3 is ${user1==user3}")//true
    println("user1===user3 is ${user1===user3}")//true

    val int1=Integer(10)
    val int2=Integer(10)
    val int3=int1
    println("int1==int2 is ${int1==int2}")//true
    println("int1===int2 is ${int1===int2}")//false
    println("int1==int3 is ${int1==int3}")//true
    println("int1===int3 is ${int1===int3}")//true

    val data1: Int=10
    val data2: Int=10
    println("data1==data2 is ${data1==data2}")//true
    println("data1===data2 is ${data1===data2}")//true


    //자바 코드로 변경할 때 -128 ~ 127 까지는 동일한 객체를 사용하고 그 이외의 숫자는 매번 새로운 객체를 생
    val boxed1:Int? = 127
    val boxed2:Int? = 127

    val boxed3:Int? = 128
    val boxed4:Int? = 128
    println("boxed1===boxed2 is ${boxed1===boxed2}")
    println("boxed3===boxed4 is ${boxed3===boxed4}")

    //문자열 상수는 ? 여부와 상관없이 같은 객체를 이용
    val str1: String="hello"
    val str2: String="hello"
    println("str1==str2 is ${str1==str2}")
    println("str1===str2 is ${str1===str2}")

    val str3: String?="hello"
    val str4: String?="hello"
    println("str3==str4 is ${str3==str4}")
    println("str3===str4 is ${str3===str4}")

}