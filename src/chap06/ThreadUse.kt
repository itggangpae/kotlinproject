package chap06

//Thread 클래스를 상속받아 구현하기
class ThreadEx: Thread() {
    override fun run() {
        for(i in 0..9){
            Thread.sleep(1000)
            println("Thread 클래스를 이용한 구현")
        }
    }
}

// Runnable 인터페이스로부터 run() 구현하기
class RunnableImpl: Runnable {
    override fun run() {
        for(i in 0..9){
            Thread.sleep(1000)
            println("Runnable 인터페이스를 이용한 구현")
        }
    }
}

fun main() {
    val threadEx = ThreadEx()
    threadEx.start()

    val runnableImpl = RunnableImpl()
    val th = Thread(runnableImpl)
    th.start()

    //익명 객체를 이용한 스레드의 실행
    object : Thread() {
        override fun run() {
            for(i in 0..9){
                Thread.sleep(1000)
                println("Annonymous Class를 이용한 구현")
            }
        }
    }.start()

    // 람다식을 이용한 스레드의 생성
    Thread({
        for(i in 0..9){
            Thread.sleep(1000)
            println("람다를 이용한 구현")
        }
    }).start()
}