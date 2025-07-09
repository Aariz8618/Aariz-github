open class Animal {

    open fun getBreed(): String {
        return "Unknown"
    }

    open fun isMammal(): Boolean {
        return false
    }

    open fun canFly(): Boolean {
        return false
    }
}

class Pigeon : Animal() {

    override fun canFly(): Boolean {
        return true
    }
}

fun main() {
    val pigeon = Pigeon()

    println("Is mammal " + pigeon.isMammal())
    println("Can fly? " + pigeon.canFly())
    println("Breed = " + pigeon.getBreed())
}

