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
println(list2.sum())

val list2 = listOf("a", "bbb", "cc")
println(list2.sumBy { it.length })





