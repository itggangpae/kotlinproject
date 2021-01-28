package chap03
//Top Level에 생성
infix fun String.add(other:String): String {
    return this + other
}

val string = "Hello" add "World"

class MyString {
    var string = ""
    //클래스 안의 메소드로 생성
    infix fun add(other: String) {
        this.string = this.string + other
    }
}

fun main() {
    println(string)
    val myString = MyString()
    myString add "Hello"
    myString add "World"
    myString.add("Kotlin")
    System.out.println(myString.string)
}
