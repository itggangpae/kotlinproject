package chap05

class Student {
    var num: Int = 1
        get() = field
        set(value) {field=value}

    var name: String = "cyberadam"
        get(){
            println("name 속성에 접근하고자 함")
            return field
        }
        set(value) {field=value}

    var score: Int = 0
        get() = field
        set(value) {
            if(value >= 0){
                field = value
            }else{
                println("점수는 0보다 작을 수 없음")
                field = 0
            }
        }
}

fun main(args: Array<String>) {
    val student = Student()
    student.num = 10
    student.name = "cyberadam"
    println("name : ${student.name}")
    student.score = -100
}