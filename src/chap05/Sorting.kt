package chap05

fun main(args: Array<String>) {
    list.forEach({print("${it.name} ")})
    print("\n");
    val reverse = list.reversed()
    reverse.forEach({print("${it.name} ")})
    print("\n");

    var nameSort = list.map{it.name}.sorted()
    nameSort.forEach({print("${it} ")})
    print("\n");

    var nameSorting = list.sortedByDescending{it.name}
    nameSorting.forEach({print("${it.name} ")})
    print("\n");
}