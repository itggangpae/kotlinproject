package chap06

fun main(args: Array<String>) {
    val array= arrayOf("0", 1, "6")
    val result:Int = try {
        println("try top...")
        val intData: Int= array[0] as Int
        val data: String = array[3] as String
        intData
    }catch (e: ClassCastException){
        println("catch... ClassCastException")
        -1
    }catch (e: ArrayIndexOutOfBoundsException){
        println("catch... ArrayIndexOutOfBoundsException")
        -2
    }catch (e: Exception){
        println("catch... Exception... ${e.toString()}")
        -3
    }finally{
        0
    }
    println("result:${result}")
}