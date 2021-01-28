package chap06

class MyDelegatee {
    fun print(str: String){
        println("i am delegatee : $str")
    }
}

class MyDelegator {
    val delegatee: MyDelegatee = MyDelegatee()

    fun print(str: String){
        delegatee.print(str)
    }
}

fun main(args: Array<String>) {
    val obj: MyDelegator = MyDelegator()
    obj.print("Hello Delegate")
}