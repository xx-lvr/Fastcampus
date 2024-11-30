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

val number2: Int = 10 + 25 // =을 기준으로 오른쪽에는 값이 오면 된다 -> 식이 와도 된다.
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

// when
val number4: Int = 5
when(number4){
    5 -> {
        println("5 입니다")
    }
    6->{
        println("6 입니다")
    }
    else ->{
        println("모르겠습니다")
    }
}
when (number4){
    5-> println("5입니다")
    6-> println("6입니다")
    else-> println("모르겠습니다")
}

when(number4) {
    4 -> println("number is 4")
    "안녕하세요" -> println("Hello")
    is Boolean -> println("boolean")
}

when (number4) {
    in 1..10 -> println("number is in 1..10") // number4 in 1..10 -> Boolean
    in 20..30 -> println("nubmer is in 1..10")
    in 40..60 -> println("number is in 1..10")
}