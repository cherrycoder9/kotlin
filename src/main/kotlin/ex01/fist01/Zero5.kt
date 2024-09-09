package ex01.fist01

// Nullable 변수
// 코틀린에선 기본적으로 모든 변수는 널이 될 수 없음
// 만약 변수가 null을 가질 수 있는 경우, 타입에 ?를 붙여 널 타입으로 선언해야 함
// 널 허용 변수는 null 안전성을 보장하기 위한 여러 기능과 함께 사용됨

fun main() {
    var nullableVariable: String? = "초기 값"
    println("nullable 변수 초기값: $nullableVariable")

    // nullable 변수는 안전한 호출 연산자(?.)로 접근해야 함
    var length = nullableVariable?.length ?: 0
    println("nullable 변수 길이: $length")

    nullableVariable = null
    println("nullable 변수 null 할당 후: $nullableVariable")

    // nullable 변수는 안전한 호출 연산자(?.)로 접근해야 함
    length = nullableVariable?.length ?: 0
    println("nullable 변수 길이: $length")

    // var: 값을 자유롭게 변경할 수 있는 가변 변수
    // val: 한 번 초기화 후 변경할 수 없는 불변 변수, 참조 불변이지만 객체 상태는 가변일 수 있음
    // lateinit: var에만 적용 가능하며, 초기화 지연 가능
    // const val: 컴파일 타임 상수, 원시 타입과 문자열만 사용 가능
    // null: 안전성을 고려한 Nullable 변수 선언
}