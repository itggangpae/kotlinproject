package chap02
//var externvar: Int //초기화 하지 않아서 에러

class Sample{
    //var classvar : Int //초기화 하지 않아서 에러
}

fun main(args:Array<String>){
    var localvar : Int

    //println(localvar) //함수 내의 지역변순는 초기화하지 않고 생성은 가능하지만 초기화하지 않고 사용하면 에러

    localvar = 3
    println(localvar)
}