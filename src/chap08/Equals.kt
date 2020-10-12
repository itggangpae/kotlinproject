package chap08

class Product(val name: String, val price:Int)

data class Person(val name: String, val age: Int){
    var email:String = "ggangpae1@gmail.com"
}

fun main(args: Array<String>) {

    var product1=Product("prod1",100)
    var product2=Product("prod1",100)
    println(product1.equals(product2))

    var user1=Person("adam",30)
    var user2=Person("adam",30)
    println(user1.equals(user2))

    var user3=Person("adam",30)
    user3.email = "ggangpae1@gmail.com"
    var user4=Person("adam",30)
    user4.email = "itstudy@kakao.com"
    println(user1.equals(user2))
}
