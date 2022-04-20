/** 함수 **/
// 코드를 미리 작성해 놓고 필요할 때 불러 다 쓰는 개념
// Java에서는 클래스에 메서드를 만들어 사용하지만
// Kotlin은 C언어 처럼 함수라는 개념을 제공

// fun 함수명(매개변수):반환타입
// 함수에서 반환할 값이 있다면 return 문을 통해 반환한다.

// 함수의 오버로딩
// 매개변수의 형태를 다르게 하여 같은 이름으로 여러 함수를 정의하는 개념

// 지역 함수
// 함수 내에 정의한 함수
// 함수를 정의한 함수 안에서만 호출이 가능

fun main() {
    test1()
    test2(10, 1111.111) //값을 넣으면 어떤 변수에 들어가는지 가상으로 알려줌
    test2(a2=66.66, a1=600) //매개변수 이름을 작성하며 사용할수도 있음
    test3(100, 11.88)
    test3(200)
    //test3(6.27) //에러
    test3(a2=6.27)
    test3(a2=55.18) //기본값이 설정되어 있느 매개변수를 사용할때는 이름을 붙여서 활용할수도 있음
    var result4 = test4()
    println(result4)
    test5()
    test7()
    test7(10)
    test7(33.2)
    test7(10, 20)
    test8()
    //test9() //레퍼런스를 찾을수가 없다
}

fun test1() {
    println("test1 함수")
}

fun test2(a1:Int, a2:Double) {
    println("test2 호출")
    println(" a1 : $a1")
    println(" a2 : $a2")
}

fun test3(a1:Int=0, a2:Double=44.18) {
    println("test3 호출")
    println(" a1 : $a1")
    println(" a2 : $a2")
}

fun test4(a1:Int=10, a2:Int=13):Int {
    println("test4 호출")
    println("a1 * a2 ${a1*a2}")
    return a1 * a2
}

fun test5():Unit { // Unit는 생략 가능 함 fun test5() { .. }
    println("test5 호출 (Unit)")
}

fun test7() {
    println("test7 호출 - 매개변수 없음")
}

fun test7(a1:Int) {
    println("test7 호출 - 매개변수 1개 (Int)")
}

fun test7(a1:Double) {
    println("test7 호출 - 매개변수 1개 (Double)")
}

fun test7(a1:Int, a2:Int) {
    println("test7 호출 - 매개변수 2개 (Int, Int)")
}

fun test8() {
    println("test8 호출")

    fun test9() {
        println("test9 호출")
    }

    test9()
}