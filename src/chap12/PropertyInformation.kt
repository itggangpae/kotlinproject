package chap12

import kotlin.reflect.KMutableProperty
import kotlin.reflect.KProperty

val myVal: Int = 3
var myVar: Int = 5

class PropertyClass {
    val objVal: Int = 10
    var objVar: Int = 20
}

fun reflectionProperty(obj: Any?,arg: KProperty<*>){
    println("property name: ${arg.name}, property type: ${arg.returnType}")
    if(obj != null){
        println(arg.getter.call(obj))
    }else {
        println(arg.getter.call())
    }
}

fun reflectionMutableProperty(obj: Any?, arg: KMutableProperty<*>){
    println("property name: ${arg.name}, property type: ${arg.returnType}")
    if(obj != null){
        arg.setter.call( obj, 40)
        println(arg.getter.call(obj))
    }else {
        arg.setter.call( 40)
        println(arg.getter.call())
    }
}

fun main(args: Array<String>) {

    reflectionProperty(null, ::myVal)
    reflectionMutableProperty(null, ::myVar)

    val obj: PropertyClass = PropertyClass()
    reflectionProperty(obj, PropertyClass::objVal)
    reflectionMutableProperty(obj, PropertyClass::objVar)
}