class ClassExample {

    val a = 10
    private var b = 20

    private lateinit var c: String

    fun updateB(b: Int) {
        this.b = b
        println("New value of b ${b}")
    }

    fun  setC(c: String): String {
        this.c = c
        return "New value of c is $c"
    }
}

fun main() {
//    val newClass = ClassExample()
//
//    println(newClass.a)
//
//    newClass.updateB(400)
//
//    println(newClass.setC("300"))

    val orders = arrayListOf(100, 200, 400, 450, 500, 520, 10, 120, 500, 540, 700)

    val filteredOrders = orders.filter { it > 400 }
    println(filteredOrders)
}

fun getAbove(value: Int): Boolean {
    if (value > 400) {
        return true
    }
    return false
}