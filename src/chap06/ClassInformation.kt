package chap06

import kotlin.reflect.KClass
import kotlin.reflect.full.primaryConstructor


open class MyDefineClass(no: Int) {
    constructor(no: Int, name: String): this(10){}
    constructor(no: Int, name: String, email: String): this(10){ }
}

fun classFun(arg: KClass<*>){
    println("class info...........")
    println("isAbstract : ${arg.isAbstract}")
    println("isCompanion : ${arg.isCompanion}")
    println("isData : ${arg.isData}")
    println("isFinal : ${arg.isFinal}")
    println("isInner : ${arg.isInner}")
    println("isOpen : ${arg.isOpen}")
    println("isSealed : ${arg.isSealed}")
}

fun constructorFun(arg: KClass<*>){
    print("primary constructor.....")
    val primaryConstructor=arg.primaryConstructor
    if(primaryConstructor != null){
        val parameters = primaryConstructor.parameters
        for(parameter in parameters){
            print("${parameter.name}: ${parameter.type} .. ")
        }
    }
}

fun main(args: Array<String>) {
    classFun(MyDefineClass::class)
    constructorFun(MyDefineClass::class)
}
