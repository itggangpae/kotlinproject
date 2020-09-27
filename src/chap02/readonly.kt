var rw : Int = 10
    get(){
        println("rw를 =없이 사용")
        return field
    }
    set(value:Int){
        println("rw를 =와 함께 사용")
        field = value
    }

var large : Boolean = true
val readonly : String = "Readonly"
    get(){
        if(large == true)
            return field.toUpperCase()
        else
            return field.toLowerCase()
    }

/*
//const는 get을 만들 수 없음
const val constant : Int = 200
    get(){
        return field
    }
*/
fun main(args:Array<String>){
    println(rw) //get() 호출
    rw = 100 //set() 호출

    println(readonly)
    large = false
    println(readonly)
}