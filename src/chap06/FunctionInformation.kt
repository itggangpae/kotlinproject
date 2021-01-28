package chap06

import kotlin.reflect.KFunction

fun myDefineFun(no: Int, name: String): Boolean {
    return true
}

fun reflectionFun(argFun: KFunction<*>) {
    print("${argFun.name}")
    val parameters = argFun.parameters
    print("(")
    for (parameter in parameters) {
        print("${parameter.name}: ${parameter.type} ")
        if (parameter.index < parameters.size - 1)
            print(",")
    }
    print("): ")
    print("${argFun.returnType}")
}

fun main(args: Array<String>) {
    reflectionFun(::myDefineFun)
}