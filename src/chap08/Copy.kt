package chap08

fun main(args: Array<String>) {
    val property = Property("박문석", 50)
    val weakcopy = property
    val deepcopy = property.copy("아담")
    println("해시코드:${property.hashCode()} 데이터:${property.toString()}")
    println("해시코드:${weakcopy.hashCode()} 데이터:${weakcopy.toString()}")
    println("해시코드:${deepcopy.hashCode()} 데이터:${deepcopy.toString()}")
}
