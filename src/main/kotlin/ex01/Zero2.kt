package ex01

// 늦은 초기화 (Lateinit)
// var 키워드로 선언된 변수를 나중에 초기화하려면 lateinit 키워드 사용
// 오직 var에만 적용 가능, 기본 타입에는 사용할 수 없음
// 초기화 전에 변수를 사용하려고 하면 예외 발생

class Example {
    lateinit var lateInitVariable: String

    fun initializeVariable() {
        lateInitVariable = "나중에 초기화된 값"
    } // initializeVariable()

    fun printVariable() {
        // ::는 리플렉션(Reflection) 연산자
        // 클래스나 객체에 선언된 속성이나 함수를 참조해 정보를 확인하거나 실행
        // isInitialized는 해당 변수가 초기화되었는지 확인하는 함수
        if (::lateInitVariable.isInitialized) {
            println("lateinit 변수 값: $lateInitVariable")
        } else {
            println("lateinit 변수가 초기화되지 않았습니다.")
        }
    } // printVariable()
}

fun main() {
    val example = Example()
    example.printVariable()
    example.initializeVariable()
    example.printVariable()
}