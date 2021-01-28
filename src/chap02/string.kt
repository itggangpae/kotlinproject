package chap02

fun main(args: Array<String>) {
    var ch = '한'//하나의 문자로 Char 생성
    println(ch)
    ch = '\uD55C' //한의 유니코드를 이용해서 생성
    println(ch)
    ch = '\\' //\를 제어문자를 이용해서 표현
    println(ch)

    //제어문자를 이용한 줄 바꿈
    val str1="Hello\nAdam"
    //raw string을 이용한 줄 바꿈
    val str2="""Hello
Adam"""
    println(str1)
    println(str2)

    //문자열 템플릿 사용
    val name: String="Adam"
    val alias: String="ITGGANGPAE"
    println("name: ${name} alias : $alias")

}