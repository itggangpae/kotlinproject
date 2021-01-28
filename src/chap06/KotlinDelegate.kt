package chap06

interface Print {
    fun print(arg: String)
}

class KotlinDelegatee: Print {
    override fun print(arg: String) {
        println("i am delegatee : $arg")
    }
}

class KotlinDelegator(obj: KotlinDelegatee): Print by obj

fun main(args: Array<String>) {
    val obj: KotlinDelegatee = KotlinDelegatee()
    KotlinDelegator(obj).print("Hello Delegate")
}