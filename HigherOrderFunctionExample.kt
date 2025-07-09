class HigherOrderFunctionExample {

    fun addition(a: Int, b: Int): Int {
        return a + b
    }

    fun additionHigherOrder(a: Int, b: Int, add: (a: Int, b: Int) -> Int): Int {
        return add(a, b)
    }

    fun printAnything(functions: () -> Unit) {
        functions()
    }

    val arrayList = arrayListOf(1, 2, 3, 4, 5)

    fun filter(list: ArrayList<Int>, number: () -> Int): ArrayList<Int> {

        if (number() == -1) {
            return list
        }

        val tempList = ArrayList<Int>()

        list.forEach {
            if (it == number()) {
                tempList.add(it)
            }
        }
        return tempList
    }

}

fun main() {
    val example = HigherOrderFunctionExample()

    //println(example.addition(10, 20))

    example.additionHigherOrder(100, 200, add = { a, b ->
        return@additionHigherOrder a + b
    })

//    example.printAnything {
//        println("Hi")
//        println("Hello world")
//    }

    example.printAnything(functions = {

    })

//    example.printAnything({ myFunction() })

    val orders = arrayListOf(100, 200, 300, 500, 100, 200, 300, 500, 100, 200, 300, 500, 100, 200, 300, 500)
    val orderValue = 150
    val filteredOrders = example.filter(
        number = {
            if (orderValue > 200) {
                orderValue
            } else {
                -1
            }
        },
        list = orders,
    )
    println(filteredOrders)
}

fun myFunction() {
    println("New function")
}