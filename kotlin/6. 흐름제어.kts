//if
val number: Int = 30
if (number == 10) {
    // 위 조건을 만족하는 경우
    println("10입니다.")
} else if (number == 20) {
    println("20입니다.")
} else {
    println("10, 20 둘 다 아닙니다.")
}

val number1: Int = 30 // number1 변수를 선언합니다.
if (number1 == 10) println("10입니다.")
else if (number1 == 20) println("20입니다.")
else println("10과 20 둘 다 아닙니다.")

val number2: Int = 10 + 25
val number3: Int = if (number2 > 30) 40 else 50
// if (number2 >30) 40 else 50
println(number3)

// 표현과 식
// 표현
// -어떤 것을 표현 하기 위해서 사용하는 문법적인 요소
// -val, var, Int, Short -> 키워드
// 식
// - 값을 만들어 낸다
// - 10 + 20 , 10 * 20