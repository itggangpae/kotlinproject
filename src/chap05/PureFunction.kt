package chap05

import java.io.File
import java.io.FileWriter

//Pure Function 이 아님 - 동일한 입력에 대하여 다른 결과를 리턴
fun function1(n: Int): Int {
    return (Math.random()*n).toInt()
}

//Pure Function 이 아님 - 외부 파일에 메시지를 저장하므로 외부에 영향을 미침
fun function2(msg: String): Boolean {
    try {
        val file= File("sample.txt")
        val out= FileWriter(file);
        out.write(msg)
        out.flush()
        return true
    }catch (e: Exception){
        return false
    }
}

//Pure Function 이 아님 - 입력이 없음
fun function3(): Int{
    return 10
}

//Pure Function 이 아님 - 리턴이 없음
fun function4(first: Int, second: Int) {
    val result= first + second
}

//Pure Function
fun function5(first: Int, second: Int): Int{
    return first + second
}
