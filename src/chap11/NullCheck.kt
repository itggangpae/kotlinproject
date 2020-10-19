package chap11

val data1: String = "cyberadam"
val data2: String? = null

class Address {
    val city: String?="seoul"
}

class User {
    val address: Address? = Address()
}

fun main(args: Array<String>) {
    //null 허용 프로퍼티에 null 불허 프로퍼티 대입 가능
    val data3: String? = data1

    //null 불허 프로퍼티에 null 허용 프로퍼티를 대입하는 것은 에러
    //val data4: String=data2//error

    //if문을 이용한 null 체크
    val length1: Int? = if(data2 != null){
        data2.length
    } else {
        null
    }

    //?연산자를 이용한 연산
    var length2: Int? = data2?.length
    println(length2)

    //null check chain ~~~~~~~~~~~~~~~~~~~~
    val user: User? = User()
    println(user?.address?.city)

    val array= arrayOf("adam", null, "itggangpae")

    array.forEach {
        if(it != null){
            println("$it .. ${it.length}")
        }
    }

    array.forEach {
        it?.let {
            println("$it .. ${it.length}")
        }
    }
}