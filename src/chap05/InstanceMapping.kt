package chap05

class UserMap(val num:Int, val name:String){}

val intUser1 : (UserMap) -> Int = {user:UserMap -> user.num}
val intUser2 : (UserMap) -> Int = {it.num}
val intUser3 : (UserMap) -> Int = UserMap::num

fun main(args:Array<String>){
    val user : UserMap = UserMap(1, "adam")
    println(intUser1(user))
    println(intUser2(user))
    println(intUser3(user))
}
