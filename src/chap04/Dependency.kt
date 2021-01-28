package chap04
data class Item(var name:String){}

class ItemFactory{
    fun production(){
        val item1 = Item("망치")
        val item2 = Item("도끼")
        println(item1)
        println(item2)
    }
}

fun main() {
   val factory = ItemFactory()
    factory.production()
}