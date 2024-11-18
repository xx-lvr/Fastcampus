fun plusNumbers(first_num: Int, second_num: Int): Int {
    val result: Int = first_num + second_num
    return result
}
// 함수를 사용(호출)하는 방법
plusNumbers(first_num = 10, second_num = 20) // 답은 30
plusNumbers(10,20) // 답은 30

val result: Int = plusNumbers(first_num = 5, second_num = 7)
println(result)

//기본값이 있는 함수
fun plusNumbersWithDefault(first_num:Int, second_Num: Int = 10): Int{
    return first_num + second_Num
}
val result2:Int = plusNumbersWithDefault(first_num = 10)
println(result2)
val result3:Int = plusNumbersWithDefault(first_num = 10, second_Num = 20)
println(result3)

// 반환값이 없는 함수를 선언하는 방법
fun plusNumberWithNoReturn (first_num: Int, second_num: Int): Unit {
    val result: Int = first_num + second_num
    println(result)
   // return 넣어도 되고 안넎어도 된다. return Unit이라고 적기는 해도 된다. 근데 비추
}
plusNumberWithNoReturn(100,200)
//함수선언을 간단하게 하는 방법
fun shortPlusNumbers(firstNum:Int,secondNum: Int) = firstNum + secondNum
val result10: Int = shortPlusNumbers(firstNum = 10, secondNum = 100)
println(result10)

//가변인자를 갖는 함수
fun plusMultipleNumbers(vararg numbers: Int): Int {
    for (number in numbers){
        print(nubmers)
    }//numbers에 들어온 값들을 하나하나 돌면서 print진행한다.
}