package chap05

fun main() {
    val smartphoneos = listOf("iOS", "android", "tizen")
    // 요소만 출력
    for (item in smartphoneos) {
        println(item)
    }
    // 인덱스와 함께 출력
    for (index in smartphoneos.indices) { // 인덱스 지정
        println("smartphoneos[$index] = ${smartphoneos[index]}")
    }
    // while 루프 이용하기
    var index = 0
    while (index < smartphoneos.size) {
        println("smartphoneos[$index] = ${smartphoneos[index]}")
        index++
    }

    // List의 기본 멤버 메서드
    println(smartphoneos.size) // 3
    println(smartphoneos.get(0)) // "iOS"
    println(smartphoneos.indexOf("tizen")) // 2
    println(smartphoneos.contains("android")) //  true

    val mutableList = smartphoneos.toMutableList()
    mutableList.add("WebOS") // 추가
    mutableList.removeAt(2) // 2번 데이터 제거
    mutableList[0] = "Apple Mobile OS" //0번 데이터를 변경
    println(mutableList)
}