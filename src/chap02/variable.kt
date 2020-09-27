val read1 :Int = 100 //자료형 명시
val read2 = 200 //자료형 유추
var assign = 700

fun main(args:Array<String>){
    //read1 = 300 //val로 선언한 변수라서 새로운 값 할당 불가능
    assign = 300 //var로 선언한 변수라서 새로운 값 할당 가능
}