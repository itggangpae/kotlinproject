package chap05

class User1() {
    var num: Int?=null
    var name: String?=null

    constructor(name: String, num: Int) : this() {
        this.num=num
        this.name=name
    }

    fun nameDisp(){
        println("hello $name")
    }
    fun disp(){
        println("num:$num name:$name")
    }
}

fun main(args: Array<String>) {
    //run : 람다 표현식을 수행하고 결과를 가져오기
    val result= run {
        println("lambda function call...")
        10 + 20
    }
    println("result : $result")

    val user = User1()
    user.num = 1
    user.name="adam"
    user.nameDisp()
    user.disp()

    //객체에서의 run 이용
    val runResult=user.run {
        num=2
        name="ggangpae1"
        nameDisp()
        disp()
        "$num-$name"
    }

    println(runResult)
}