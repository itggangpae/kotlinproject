package chap06

fun main(args: Array<String>) {
    var data: String? ="adam"
    var length: Int = if(data != null){
        data.length
    }else {
        -1
    }
    //elvis operator를 이용한 작업
    data=null
    length=data?.length ?: -1
    println(length)

    data ?: println("data is null")

    data = "itggangpae"
    data!!.length

    data=null
   // data!!.length

    val strData : String = "adam"
    //val intData: Int = strData as Int //예외 발생

    //안전한 캐스팅
    val intData: Int? = strData as? Int
    println(intData)
}