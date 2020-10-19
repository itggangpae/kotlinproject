package chap12

import kotlin.reflect.KClass

val myVal1: KClass<*> = String::class

val myVal2: KClass<String> = String::class

//val myVal3: KClass<String> = Double::class//error

val myVal4: Class<*> = String::class.java