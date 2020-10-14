package chap09

class Person{
    var num: Int?=null
    var name: String?=null

    constructor(num:Int, name: String){
        this.num=num
        this.name=name
    }
}

fun main(args: Array<String>) {
    val person = Person(1, "adam")

    //apply
    val applyPerson=person.apply {
        name="ggangpae1"
    }
    println("person name : ${person.name}, applyPerson name : ${applyPerson.name}")
    person.name="itggangpae"
    applyPerson.name="itstudy"
    println("person name : ${person.name}, applyPerson name : ${applyPerson.name}")

    //let 이용
    val letPerson = person.let {user -> Person(user.num as Int + 1, user.name as String)}
    println("person num : ${person.num}, letPerson num : ${letPerson.num}")

    //let 이용
    val withPerson = with(letPerson) {Person(letPerson.num as Int + 1, letPerson.name as String)}
    println("withPerson num : ${withPerson.num}, withPerson name : ${withPerson.name}")

}