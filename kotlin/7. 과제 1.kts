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
    else if(score)
}