package ex01.fist01

// 코틀린에서 상수는 const val로 선언할 수 있음
// 상수는 컴파일 타임에 할당됨
// const val은 최상위 레벨이거나 object 선언 내부에서만 사용할 수 있음
// 반드시 원시 타입이나 문자열 타입이어야 하며, 다른 객체에 대해 상수로 정의할 수 없음
const val MAX_COUNT = 100

fun main() {
    println("최대 카운트 값: $MAX_COUNT")
}