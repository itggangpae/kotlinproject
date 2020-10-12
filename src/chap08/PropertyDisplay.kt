package chap08

data class Property(val name: String, val age: Int){
    var email:String = "ggangpae1@gmail.com"
}

fun main(args: Array<String>) {
    val property = Property("박문석", 50)
    println(property)
    println("이름:${property.component1()}")
    println("나이:${property.component2()}")
}
