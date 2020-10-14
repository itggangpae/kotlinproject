package chap09

class User(val num:Int, val name:String){}

val intUser1 : (User) -> Int = {user:User -> user.num}
val intUser2 : (User) -> Int = {it.num}
val intUser3 : (User) -> Int = User::num

fun main(args:Array<String>){
    val user : User = User(1, "adam")
    println(intUser1(user))
    println(intUser2(user))
    println(intUser3(user))
}