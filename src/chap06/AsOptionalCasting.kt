package chap06

open class SuperCasting{
    fun superFun(){
        println("superFun()...")
    }
}

class SubCasting: SuperCasting(){
    fun subFun(){
        println("subFun1()....")
    }
}

fun main(args: Array<String>) {
    //as 이용
    println("하위->상위->하위.....")
    val superCasting: SuperCasting = SubCasting()
    val subCasting: SubCasting = superCasting as SubCasting
    subCasting.superFun()
    subCasting.subFun()

    println("상위->서브........")
    //val obj: SubCasting = SuperCasting() as Sub1 //런타임 에러

    val obj: SuperCasting? = null
    //val objcopy: SuperCasting = obj as SuperCasting //런타임 에러
    val objcopy: SuperCasting? = obj as? SuperCasting
    //objcopy.superFun() //에러

}