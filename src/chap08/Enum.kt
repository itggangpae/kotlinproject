package chap08

enum class Direction {
    NORTH, SOUTH, WEST, EAST
}

enum class Priority(val no : Int) {
    MAX(10), NORMAL(5), MIN(1)
}

fun main(args: Array<String>) {
    val direction: Direction = Direction.NORTH
    println("${direction.name} ... ${direction.ordinal}")

    val direction1=Direction.valueOf("WEST")
    println("${direction1.name} .. ${direction1.ordinal}")

    val priority: Priority = Priority.NORMAL
    println("${priority.name} .. ${priority.no}")
}