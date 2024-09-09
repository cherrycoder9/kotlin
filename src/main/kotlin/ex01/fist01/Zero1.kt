package ex01.fist01

fun main() {
    // 변수와 상수 선언의 차이
    // 코틀린에서 변수와 상수는 var, val 키워드를 통해 선언
    // var는 가변 변수, 값을 변경할 수 있음
    // val는 불변 변수, 초기화 이후 값을 변경할 수 없음
    // val는 객체의 참조를 변경할 수 없다는 의미이지, 객체 내부 상태는 변경 가능
    // val로 선언된 객체는 참조 불변일 뿐 내부 상태는 가변일 수 있음

    // 가변 변수 선언
    var mutableVariable: Int = 10
    println("가변 변수 초기값: $mutableVariable")

    mutableVariable = 20
    println("가변 변수 변경 후: $mutableVariable")

    // 불변 변수 선언
    val immutableVariable: Int = 30
    println("불변 변수 값: $immutableVariable")
}