class Fish(val waterType: String)

// Keep your existing fish instances
val fish1 = Fish("freshwater")
val fish2 = Fish("saltwater")
val fish = listOf(fish1, fish2)

// Fix the isFreshWater function to take a Fish instead of a String
fun isFreshWater(fish: Fish): Boolean {
    return fish.waterType.equals("freshwater", ignoreCase = true)
}

// Partition the list based on isFreshWater
val twoLists = fish.partition { isFreshWater(it) }

val equipment = "fish net" to "catching fish"

val numbers = Triple(6, 9, 42)

val equipment2 = ("fish net" to "catching fish") to "equipment"
println("${equipment2.first} is ${equipment2.second}\n")
println("${equipment2.first.second}")

val (tool, use) = equipment
println("$tool is used for $use")

val (n1, n2, n3) = numbers
println("$n1 $n2 $n3")

val list = listOf(1, 5, 3, 4)
println(list.sum())

val list2 = listOf("a", "bbb", "cc")
//println(list2.sum()

//val list2 = listOf("a", "bbb", "cc")
//println(list2.sumBy { it.length })
//
//val list2 = listOf("a", "bbb", "cc")
//for (s in list2.listIterator()) {
//    println("$s ")
//}

val scientific = hashMapOf("guppy" to "poecilia reticulata", "catfish" to "corydoras", "zebra fish" to "danio rerio" )

println (scientific.get("guppy"))

println(scientific.get("zebra fish"))

//println("scientific.get("swordtail"")

println(scientific.getOrElse("swordtail") {"sorry, I don't know"})

//const val rocks = 3
//val value1 = complexFunctionCall() // OK
//const val CONSTANT1 = complexFunctionCall() // NOT ok

object Constants {
    const val CONSTANT2 = "object constant"
}
val foo = Constants.CONSTANT2

class MyClass {
    companion object {
        const val CONSTANT3 = "constant in companion"
    }
}

//fun String.hasSpaces(): Boolean {
//    val found = this.indexOf(' ')
//    // also valid: this.indexOf(" ")
//    // returns positive number index in String or -1 if not found
//    return found != -1
//}

fun String.hasSpaces() = indexOf(" ") != -1

//class AquariumPlant(val color: String, private val size: Int)
//
//fun AquariumPlant.isRed() = color == "red"    // OK
//fun AquariumPlant.isBig() = size > 50         // gives error

open class AquariumPlant(val color: String, private val size: Int)

class GreenLeafyPlant(size: Int) : AquariumPlant("green", size)

fun AquariumPlant.print() = println("AquariumPlant")
fun GreenLeafyPlant.print() = println("GreenLeafyPlant")


    val plant = GreenLeafyPlant(size = 10)
    plant.print()
    println("\n")
    val aquariumPlant: AquariumPlant = plant
    aquariumPlant.print()  // what will it print?

val AquariumPlant.isGreen: Boolean
    get() = color == "green"

aquariumPlant.isGreen

fun AquariumPlant?.pull() {
    this?.apply {
        println("removing $this")
    }
}

val plant: AquariumPlant? = null
plant.pull()














