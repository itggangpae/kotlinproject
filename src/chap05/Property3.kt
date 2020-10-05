package chap05

class Customer(num:Int, name:String, isFever:Boolean) {
    var num = num
    var name = name
    var isFever = isFever
    get(){
        println("발열에 접근")
        return field
    }
    set(value){
        print("빌열을 변경할려고 함")
        field = value
    }
}

fun main(args: Array<String>) {
    var customer = Customer(1, "jessica", false)
    println("발열 여부 : ${customer.isFever}")
    customer.isFever = true
}