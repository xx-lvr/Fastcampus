// 배열을 선언하는 방법 (1)
var array1 = arrayOf(true, "HI", 10, 2.2)
var array2 = arrayOf<Int?>(1, 2, 3, 4, 5, null)
var array3 = intArrayOf(1, 2, 3, 4, 5)

// 배열을 선언하는 방법 (2)
var array4 = Array(size:10, { 0 })
println(array[0])
println(array[2])
println(array[4])
println(array[6])
var array5 = IntArray(size:10, { 0 })
//var array6 = String(10, {"Hi"}) // -> 불가능