package chap06

annotation class PropertyAnnotation(val count: Int)

class PropertyAnnotationClass {
    @PropertyAnnotation(count=3)
    fun some(){
        println("some.....")
    }
}

fun main(args: Array<String>) {

    val obj: PropertyAnnotationClass = PropertyAnnotationClass()

    val methods = TestClass::class.java!!.methods

    for(method in methods){
        if(method.isAnnotationPresent(PropertyAnnotation::class.java)){
            val annotation=method.getAnnotation(PropertyAnnotation::class.java)
            val count = annotation.count
            for(i in 1..count){
                obj.some()
            }
        }
    }
}
