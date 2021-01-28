package chap05

fun main(){
    val matrix:MutableList<MutableList<String>> = mutableListOf()

    val soccer : MutableList<String> = mutableListOf<String>("루드 굴리트", "베르캄프")
    val baseball : MutableList<String> = mutableListOf<String>("랜디 존슨", "마크 맥과이어")

    matrix.add(soccer)
    matrix.add(baseball)

    //soccer.add("에우제비오")
    //val go : MutableList<String> = mutableListOf<String>("조훈현", "김혜민")
    //matrix.add(go)

    var index = 0
    for(data in matrix){
        if(index == 0){
            print("축구:")
        }else{
            print("야구:")
        }
        println(data)
        index = index + 1
    }
    println()
    println()

    val table:MutableList<Map<String, Any>> = mutableListOf()

    var map:MutableMap<String, Any> = mutableMapOf()
    map.put("종목", "축구")
    map.put("선수", soccer)
    table.add(map)

    map = mutableMapOf()
    map.put("종목", "야구")
    map.put("선수", baseball)
    table.add(map)

    val go : MutableList<String> = mutableListOf<String>("조훈현", "김혜민")
    map = mutableMapOf()
    map.put("종목", "바둑")
    map.put("선수", go)
    table.add(map)

    for(temp in table){
        println("${temp.get("종목")}:${temp.get("선수")}")
    }


}