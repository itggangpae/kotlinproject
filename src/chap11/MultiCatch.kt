package chap11

fun main(args: Array<String>) {
    val array= arrayOf("0", 1, "6")
    try {
        println("try top...")
        val intData: Int= array[0] as Int
        val data: String = array[2] as String
        val data2: Int = data.toInt()
    }catch (e: ClassCastException){
        println("catch... ClassCastException")
    }catch (e: ArrayIndexOutOfBoundsException){
        println("catch... ArrayIndexOutOfBoundsException")
    }catch (e: Exception){
        println("catch... Exception... ${e.toString()}")
    }
}