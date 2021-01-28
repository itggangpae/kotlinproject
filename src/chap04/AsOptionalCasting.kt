package chap04

class NullCasting{
    fun superFun(){
        println("superFun()...")
    }
}

fun main(args: Array<String>) {

    val obj: NullCasting? = null
    //val objcopy: NullCasting = obj as NullCasting //런타임 에러
    val objcopy: NullCasting? = obj as? NullCasting
    //objcopy.superFun() //에러
    if(objcopy != null){
        objcopy.superFun()
    }else{
        println("objcopy is null")
    }
}