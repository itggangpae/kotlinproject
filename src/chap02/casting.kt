package chap02

fun main(args: Array<String>) {
    val obj : Any = "I am String"
    //println("obj 길이: ${obj.length}") //에러

    if(obj is String){
        println("obj 길이: ${obj.length}")
    }
    val n : Int =65
    //var d : Double = n //자료형이 다르므로 에러
    var d : Double = n.toDouble()

    var ch : Char = n.toChar()

    println("d:$d")
    println("ch:$ch")
}