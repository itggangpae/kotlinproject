package chap04

class Product(val name: String, val price:Int)

data class Factory(val name: String, val phone: String){
    var email:String = "ggangpae1@gmail.com"
}

fun main(args: Array<String>) {

    //값은 동일하지만 equals를 재정의하지 않았으므로 서로 다름
    var product1=Product("prod1",100)
    var product2=Product("prod1",100)
    println(product1.equals(product2))

    //내용이 다르기 때문에 서로 다름
    var factory1=Factory("adam","010")
    var factory2=Factory("adam","011")
    println(factory1.equals(factory2))

    //내용이 같고 equals가 재정의 되어 있으므로 2개는 일치
    var factory3=Factory("adam","012")
    var factory4=Factory("adam","012")
    println(factory3.equals(factory4))

    factory3.email = "ggangpae1@gmail.com"
    factory4.email = "itstudy@kakao.com"
    println(factory3.equals(factory4))
}
