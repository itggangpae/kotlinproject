package chap05
//함수 타입에 대한 별명 생성
typealias MyLambda = (Int, Int) -> Int

fun main(args:Array<String>){
    //람다를 만들고 바로 실행
    {println("바로 실행")}()
    run {println("바로 실행")}

    //val lambdaType = {first, second -> first + second} //error 함수의 타입을 설정하지 않았으므로 매개변수의 자료형을 유추할 수 없음
    val lambdaType : (Int, Int) -> Int = {first, second -> first + second}
    println(lambdaType(100, 200))

    //별명을 이용한 호출
    val lambdaAlias : MyLambda = lambdaType
    println(lambdaAlias(100, 200))

    //매개변수가 1개인 경우 매개변수를 생략하고 it 사용 가능
    val lambdaIt:(Int) -> Int = {it * 100}
    println(lambdaIt(5))

}