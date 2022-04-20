
/** 연산자 */
// 대부분의 특수문자를 연산자로 사용한다
// 주어진 값을 정해진 방식에 따라 계산하고 그값을 되돌려준다
// Kotlin은 연산자와 함수 두가지를 제공

// 단항연산자
// +a -a !a
// a.unaryPlus() a.unaryMinus() a.not()

fun main() {
    //-----------------------------------
    // 단항 연산자 : 항이 하나인 연산자
    // + : 양수 -> 양수, 음수 -> 음수
    val a1:Int = 10
    val a2:Int = -10

    val r1:Int = +a1
    val r2:Int = -a2

    val a4:Boolean = false
    val r4:Boolean = !a4

    println("a1 : $a1 , r1 : $r1")
    println("a2 : $a2 , r2 : $r2")
    println("a4 : $a4 , r4 : $r4")

    //-----------------------------------
    // 증감연산자
    // a++ a.inc()
    // a-- a.dec()

    var a5:Int = 10;
    var a6:Int = 10;
    val r5:Int = a5++
    val r6:Int = a6--
    println("a5 : $a5, r5 : $r5")
    println("a6 : $a6, r6 : $r6")

    //-----------------------------------
    // 산술연산자
    // a + b , a - b, a * b, a / b , a % b, a..b
    println("----------------------")
    val r11:Int = 10 + 3
    val r12:Int = 10 - 3
    val r13:Int = 10 * 3
    val r14:Int = 10 / 3
    val r15:Int = 10 % 3
    val r16:IntRange = 10..20
    println("r11 : $r11")
    println("r12 : $r12")
    println("r13 : $r13")
    println("r14 : $r14")
    println("r15 : $r15")
    println("r16 : $r16")

    //------------------------------------
    // 대입연산자
    // a += b, a -= b, a *= b, a /=b, a %= b
    var a17:Int = 10
    var a18:Int = 10
    var a19:Int = 10
    var a20:Int = 10
    var a21:Int = 10

    a17 += 3
    a18 -= 3
    a19 *= 3
    a20 /= 3
    a21 %= 3
    println("------------------------")
    println("a17 : $a17")
    println("a18 : $a18")
    println("a19 : $a19")
    println("a20 : $a20")
    println("a21 : $a21")

    println("------------------------")
    // 비교연산자
    val a12:Int = 14;
    val r22:Boolean = a12 == 10
    val r23:Boolean = a12 != 10
    println("r22 : $r22, r23 : $r23")

    val a24:Int = 10
    val a25:Int = 3
    val r24:Boolean = a24 > a25
    val r25:Boolean = a24 < a25
    val r26:Boolean = a24 >= a25
    val r27:Boolean = a24 <= a25
    println("result : $r25 , $r25, $r26, $r27")
}