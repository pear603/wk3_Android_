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


