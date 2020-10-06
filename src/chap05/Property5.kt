package chap05

import kotlin.properties.Delegates

class Observer {
    var name: String by Delegates.observable("noname", { props, old, new ->
        println("Properties : $props")
        println("oldValue : $old ... newValue : $new")
    })
}

fun main(args: Array<String>) {
    val observer=Observer()
    println(observer.name)
    observer.name="adam"
    observer.name="itggangpae"
}