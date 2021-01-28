package chap05

fun main(){
    val set: Set<String> =
        hashSetOf<String>(
            "Pascal", "Cobol", "Assembly",
            "Visual Basic", "C&C++", "Java")
    println(set)

    val linkedHashSet = linkedSetOf<String>("Java", "C#", "JavaScript",
        "Python", "R", "Swift", "Kotlin", "C&C++"
    )
    println(linkedHashSet)

    val treeSet = set.union(linkedHashSet).toSortedSet()
    println(treeSet)
}