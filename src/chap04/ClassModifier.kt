package chap04

class Singleton private constructor() {

    companion object {
        @Volatile private var instance: Singleton? = null

        @JvmStatic fun getInstance(): Singleton =
            instance ?: synchronized(this) {
                instance ?: Singleton().also {
                    instance = it
                }
            }
    }

    private var data: Int = 10

    fun getData(): Int {
        return data
    }

    fun setData(data : Int) {
        this.data = data
    }
}

fun main(args: Array<String>) {
    //val singleton : Singleton = Singleton() //에러

    val singleton1 = Singleton.getInstance()
    val singleton2 = Singleton.getInstance()
    println("$singleton1")
    println("$singleton2")

    //singleton1.data = 10; //에러
    singleton1.setData(100)
    println("${singleton1.getData()}")
}