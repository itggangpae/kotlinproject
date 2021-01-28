package chap02

//val externvar:String = null //?를 추가하지 않아서 null을 저장할 수 없는 자료형으로 선언되었으므로 null을 대입해서 에러
var nullable:String? = null

fun main(args:Array<String>){
    nullable="Null 저장 가능한 변수"
    print(nullable)
}