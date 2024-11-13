// 산술연산자
var number1: Int = 1 + 10
var number2: Int = 2 - 10
var number3: Int = 2 * 40
var number4: Int = 40 / 2
var number5: Int = 45 % 7
println(number5)
// 대입연산자
// A = B -> B가 A에 할당된다
// X = 2 -> 2가 X에 할당된다
var number7: Int = 22
println(number7)
number7 = 100
println(number7)
// 복합대입연산자
// A+=B -> A = A + B
var number8: Int = 12
number8 += 8
number8 -= 10
number8 *= 2
number8 /= 5
println(number8)
//증감연산자 (++, --)
// A++, B-- 값을 먼저 반환하고 증감 한다
// ++A, --B 증감을 먼저 하고 값을 반환한다.
// ++5 -> 6, 5++ -> 5
var number9: Int = 10
println(++number9)
println(number9)
println(++number9)
