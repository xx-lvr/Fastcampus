// List
val numbers = listOf<Int>(1, 2, 3)
println(numbers[0])
println(numbers.get(1))
println(numbers.indexOf(2))
println(numbers.last())
println(numbers.first())
val numbers2 = mutableListOf<Int>(1, 1, 1 2, 3)
numbers2.add(50)
println(numbers2)
numbers2.removeAt(index:0)
println(numbers2)

// Set
val numbers3 = SetOf<Int>(1, 1, 1, 3, 3, 4)
val numbers4 = mutableListOf<Int>(1, 1, 1, 3, 3, 4)

// Map
val numbers5 = mapOf<Int, String>(1 to "one", 2 to "two")
val numbers6 = mapOf<Int, String>(Pair(1 to "one"), Pair(2 to "two"))
println(numbers5)