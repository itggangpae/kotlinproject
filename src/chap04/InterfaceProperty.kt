package chap04
/*
interface MyInterface {

    var prop1: Int // abstract

//    val prop2: String = "adam"//error

//    val prop3: String//error
//        get() = field

//    var prop4: String//error
//        get() = "adam"

    val prop5: String
        get() = "adam"

    var prop6: String
        get() = "itggangpae"
        set(value) {

        }
}

interface PropertyInterface {

    var data1: Int

    var data2: Int
        get() = 0
        set(value){
            if(value > 0)
                calData(value)
        }

    val data3: Boolean
        get(){
            if(data1 > 0) return true
            else return false
        }


    private fun calData(arg: Int) {
        data1 =  arg * arg
    }

}

class MyClass: PropertyInterface {
    override var data1: Int = 0
}

fun main(args: Array<String>) {
    val obj = MyClass()
    println("data1 : ${obj.data1}, data2 : ${obj.data2}, data3 : ${obj.data3}")
    obj.data2=5
    println("data1 : ${obj.data1}, data2 : ${obj.data2}, data3 : ${obj.data3}")
}

 */