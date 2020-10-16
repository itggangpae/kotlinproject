package chap10

class User(var num:Int, var name:String, var gender:String, var score:Int){
}

val list = listOf<User>(
    User(1,"배유나", "여자", 98) ,
    User(2,"해글러", "남자", 100),
    User(3,"한유미", "여자", 84),
    User(4,"오자서", "남자", 88),
    User(5,"신예은", "여자", 95),
    User(6,"조이", "여자", 99)
)

fun main(args: Array<String>) {
    var sum = list.map { it.score }.sum()
    println("score 합계:$sum")

    sum = list.mapIndexed() { index, user -> user.score * index }.sum()
    println("score*index 합계:$sum")

    var genderGroup = list.groupBy { it.gender }
    println("성별 그룹:${genderGroup}")
    genderGroup.forEach {
        println("${it.key}: ${it.value.count()} 명")
        it.value.forEach({println("${it.name}")})
    }
    println("성별 score 합계")
    genderGroup.forEach {
        print("${it.key}:")
        println("${it.value.sumBy {it.score}}")
    }
}