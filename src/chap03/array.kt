package chap03
fun main(args: Array<String>) {

    //자료형을 결정하지 않은 배열 - 모든 자료형의 데이터를 저장할 수 있음
    var array = arrayOf(1, "adam", "01037901997")
    array[0]=3
    array[2]="ggangpae1@gmail.com"
    println("${array[0]} .. ${array[1]} .. ${array[2]}")
    println("size : ${array.size} .. ${array.get(0)} .. ${array.get(1)} .. ${array.get(2)}")

    //제너릭을 이용한 생성
    var arrayInt = arrayOf<Int>(10, 20, 30)
    println("${arrayInt.get(0)} .. ${arrayInt.get(1)} .. ${arrayInt.get(2)}")

    //동일한 자료형의 데이터를 이용한 배열의 생성 - 함수 이용
    var arrayInt2= intArrayOf(10, 20, 30)
    var arrayDouble= doubleArrayOf(10.0, 20.0, 30.0)

    //null을 저장한 상태에서 나중에 데이터를 결정하는 배열
    var array2= arrayOfNulls<Any>(3)
    array2[0]=7
    array2[1]="군계"
    array2[2]="itstudy@kakao.com"
    println("${array2[0]} .. ${array2[1]} .. ${array2[2]}")

    var emptyArray=Array<String>(3,{""})
    emptyArray[0]="adam"
    emptyArray[1]="군계"
    emptyArray[2]="ggangpae1"
    println("${emptyArray[0]} .. ${emptyArray[1]} .. ${emptyArray[2]}")

    //수식을 이용한 생성
    var array3=Array(3,  { i -> i+1})
    println("${array3[0]} .. ${array3[1]} .. ${array3[2]}")

    var array4=Array<Int>(3, {i -> i + 10})
    var array5=IntArray(3, { i -> i + 100})
    println("${array4[0]} .. ${array4[1]} .. ${array4[2]}")
    println("${array5[0]} .. ${array5[1]} .. ${array5[2]}")
}

