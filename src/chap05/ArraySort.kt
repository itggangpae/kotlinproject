package chap05

import java.util.*

data class Product(val name: String, val price: Double)

fun main() {

    val arr = arrayOf(8, 4, 3, 2, 5, 9, 1)

    // 오름차순, 내림차순으로 정렬된 일반 배열로 반환
    val sortedNums = arr.sortedArray()
    println("ASC: " + Arrays.toString(sortedNums))

    val sortedNumsDesc = arr.sortedArrayDescending()
    println("DEC: " + Arrays.toString(sortedNumsDesc))

    // 원본 배열에 대한 정렬
    arr.sort(1, 3)
    println("ORI: " + Arrays.toString(arr))
    arr.sortDescending()
    println("ORI: " + Arrays.toString(arr))

    // List 으로 반환
    val listSorted: List<Int> = arr.sorted()
    val listDesc: List<Int> = arr.sortedDescending()
    println("LST: " + listSorted)
    println("LST: " + listDesc)

    // SortBy를 이용한 특정 표현식에 따른 정렬
    val items = arrayOf<String>("Dog", "Cat", "Lion", "Kangaroo", "Po")
    items.sortBy { item -> item.length }
    println(Arrays.toString(items))

    val products = arrayOf(
        Product("Snow Ball", 870.00),
        Product("Smart Phone", 999.00),
        Product("Drone", 240.00),
        Product("Mouse", 333.55),
        Product("Keyboard", 125.99),
        Product("Monitor", 1500.99),
        Product("Tablet", 512.99))

    products.sortBy { it.price }
    products.forEach { println(it) }

    // 두 객체의 비교, p1이 크면 1, 같으면 0, 작으면 -1
    products.sortWith(
        Comparator<Product> { p1, p2 ->
            when {
                p1.price > p2.price -> 1
                p1.price == p2.price -> 0
                else -> -1
            }
        }
    )
    products.forEach { println(it) }
    println()

    //  compareBy를 함께 사용해 두개의 정보 정렬
    // varargs로 받고 있으므로 두개 이상 사용 가능
    products.sortWith(compareBy({it.name}, {it.price}))
    products.forEach { println(it) }
    println()
}
