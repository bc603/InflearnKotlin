fun main() {
    //정수 리터럴
    println(100)
    println(100000000000) //Java랑 달리 10억이 넘어도 L을 붙이지 않는다

    println(100_100_330_111)

    // 실수 리터럴
    println(11.11)
    println(22.22f)

    // 문자 리터럴
    println('A')
    println("옹")

    println("문자열")

    // 불리언
    println(true); println(false)

    // Raw String """문자열"""
    println("동해물과 백두산이\n마르고 닳도록\n하느님이 보우하시\n우리나라만세")
    println("""동해물과 백두산이
        |마르고 닳도록
        |하느님이 보우하사
        |우리나라 만세""".trimMargin())

    // Nothing 함수가 정상적으로 끝나지 않는다를 의미

    // Unit void를 의미

    /** 자료형 **/
    //정수 Long(8) Int(4) Short(2) Byte(1)

    //부호가 없는 정수형 ULong(8), UInt(4), UShort(2), UByte(1)

    //실수 Double(8) Float(4)

    //논리 Boolean(1)

    //문자 Char(2)

    //문자열 String

    println("------------------------------")

    /** 변수 선언
     * var : 선언 이후 값을 다시 저장할 수 있다
     * val : 선언 이후 값을 다시 저장할 수 없다
     * var/val 변수명:타입 = 값
     * 타입 생략 시 저장하는 값에 따라 자료형이 자동으로 결정된다.
     */
    var a1:Int = 100
    println("a1: ${a1}")
    println("a1: $a1") // {}안에 수식이나 연산자가 없는 경우에는 {} 생략가능

    val a2 = 100
    println("a2: $a2")

    /** 코틀린에서는 자료형을 생략하는 것을 권장 **/

    println("-----------------------")

    var a3:Int = 100
    val a4:Int = 200

    // val 변수는 값을 다시 저장하지 못한다
    a3 = 50
    //a4 = 60 // Val cannot be

    /** null 허용 변수 */
    // 변수는 선언할때 null 허용 여부를 설정할 수 있다
    // var/val 변수명:자료형 = 값 -> null을 허용하지 않는 변수
    // var/val 변수명:자료형? = 값 -> null을 허용하는 변수
    //var a5:Int = null // null을 허용하지 않는다
    var a5:Int = 100
    var a6:Int? = null
    println("a5 : $a5")
    println("a6 : $a6")

    //var a7:Int = a6 // Type mismatch
    var a7:Int = a6!! // !!연산자는 는 null을 허용하는 변수로 변경
                      // 문법적으로만 허용

    /** 정리 **/
    // 모든 기본 타입 값을 객체로 만들어서 관리한다
    // null을 허용하는 변수와 허용하지 않는 변수를 제공한다

}