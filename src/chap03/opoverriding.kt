package chap03

data class DTO(val no:Int){
    //정수를 매개변수로 받아서 연산한 후 정수를 리턴하는 연산자 오버로딩
    operator fun plus(arg : Int):Int{
        return no + arg
    }

    //DTO 인스턴를 매개변수로 받아서 연산한 후 정수를 리턴스하는 연산자 오버로딩
    operator fun plus(arg : DTO):Int{
        return no + arg.no
    }
}

fun main(args:Array<String>){
    val data1 = DTO(10)
    val data2 = DTO(20)

    //연산자 오버라이딩을 하지 않은 경우는 내부 데이터끼리 연산을 수행해야 함
    var result = data1.no + data2.no
    println("result:${result}")

    result = data1 + 20
    println("result:${result}")

    result = data1 + data2
    println("result:${result}")
}