import java.io.StreamCorruptedException

// 1번 같은 둘다 Int로 같은 자료형에서 둘다 1로 하면 그것도 true로 나온다.
val A : String = "아"
val B : String = "아"
val C : Boolean = if(A == B) true else false
println(C)
// 2번
val AA : Int = 10
val BB : Int = AA * 2
println(AA)
println(BB)
// 3번
fun checkGrade(String:Int) : String {
    if (score >= 90) return "A학점"
    else if(score >= 80) return "B학점"
    else if(score >= 70) return "C학점"
    else return "F학점"
    when(score){
        in 90..100 -> return "A학점"
        in 80..89 -> return "B학점"
        in 70..70 -> return "C학점"
        else -> return "F학점"
    }
}
val result: String = checkGrade(score:90)
        println(result)

// 4번
fun gradeTest(correctCount: Int): Int {
    return correctCount * 5
}

fun gradeTest2(correctCount: Int): Int = correctCount * 5

fun gradeTest3(correctCount: Int): Int {
    var result: Int = 0
    result = correctCount * 5
    return result
}

println(gradeTest(correctCount: 10))
println(gradeTest2(correctCount: 10))
println(gradeTest3(correctCount = 10))