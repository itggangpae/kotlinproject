package chap12

import kotlin.reflect.KClass
import kotlin.reflect.full.declaredMemberExtensionFunctions
import kotlin.reflect.full.declaredMemberFunctions
import kotlin.reflect.full.memberFunctions

open class SuperClass {
    fun superFun(){ }
}

class SubClass: SuperClass() {
    fun myFun() { }
    fun String.someFun() { }
}

fun functionFun(arg: KClass<*>){
    println("declaredMemberFunctions.........")
    val functions = arg.declaredMemberFunctions
    for(function in functions){
        println("${function.name}: ${function.returnType} ")
    }

    println("memberFunctions.....")
    val functions2 = arg.memberFunctions
    for(function in functions2){
        println("${function.name}: ${function.returnType} ")
    }

    println("declaredMemberExtensionFunctions...........")
    val functions3 = arg.declaredMemberExtensionFunctions
    for(function in functions3){
        println("${function.name}: ${function.returnType} ")
    }
}

fun main(args: Array<String>) {
    functionFun(SubClass::class)
}