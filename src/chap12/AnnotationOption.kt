@file: JvmName("MyTest")
package chap12
annotation class TestAnnotation1

annotation class TestAnnotation2

class TestOption constructor(@param: TestAnnotation1 var email: String){

    @get:[TestAnnotation1 TestAnnotation2]
    var no: Int=10

    @property: TestAnnotation1
    var name: String = "adam"

    @field: TestAnnotation1
    var age: Int = 30

    @setparam: TestAnnotation1
    var phone: String= "01037901997"
}
fun @receiver: TestAnnotation1 TestOption.myFun(){ }
