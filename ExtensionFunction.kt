class ExtensionFunction {
    fun printConcatinatedValues(a: String, b: Int): String {
        return "$a $b"
    }
}


fun String.concatinateValue(employees: Int): String {
    return "$this $employees"
}
fun Int.concatinateValue(employees: Int): String {
    return "$this $employees"
}

fun ExtensionFunction.printClassName(): String {
    return "${this.javaClass}"
}

fun main() {

    var organization = "apple"

    var employees = 40000



    val obj = ExtensionFunction()
    obj.printClassName()
    obj.printConcatinatedValues(organization, employees)

    println(organization.concatinateValue(employees))
}