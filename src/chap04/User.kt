package chap04

class User1{} //기본 주 생성자 제공

class User2 constructor(){} //매개변수가 없는 주 생성자 작성

class User3 constructor(num:Int, name:String){} //매개변수가 있는 주 생성자 작성

//매개변수가 있고 초기화 코드가 있는 주 생성자 작성
class User4 constructor(num:Int, name:String){
    val num = num
    val name = name

    init{
        println("초기화 블럭")
    }
}

//매개변수가 있고 초기화 코드가 있는 주 생성자 작성
class User5 constructor(num:Int, name:String){
    val num = num
    val name = "noname"

    init{
        println("초기화 블럭에서는 생성자의 매개변수를 사용")
        println("name is $name")
    }
}