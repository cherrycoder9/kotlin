package ex01.fist02

fun main() {

    // 코틀린에서 기본적으로 변수는 null 값 허용하지 않음
    // nullable 타입은 ?를 사용해 명시적으로 선언해야 함
    val nonNullable: String = "Hello"
    println(nonNullable) // Hello
    val nullable: String? = null
    println(nullable) // null

    // nullable 타입은 안전하게 다루기 위해 null 검사를 요구함
    // 코틀린은 다양한 null 처리 방식이 있음
    // 안전 호출 연산자 ?.
    // 객체가 null이면 null을 반환하고, null이 아니면 호출을 계속 진행
    printLength("헬로 코틀린") // 6

    // 엘비스 연산자 ?:
    // null일 때 대체값 적용할때 사용함
    println(getLengthOrDefault(null)) // 0

    // 안전한 캐스팅 연산자 as?
    // 타입을 안전하게 캐스팅할 수 있음, 캐스팅 실패시 null 반환
    println(castToString(45)) // null

    // Not-null 단언 연산자 !!
    // !!는 nullable 객체를 강제로 non-null로 변환하는 연산자
    // 객체가 null이면 널포인터익셉션 발생시킴. 주의해서 사용해야 함
    forceNotNull("Kotlin") // 6

    // Safe Cast와 스마트 캐스트
    // 조건에 따라 타입을 자동으로 캐스팅하는 스마트 캐스트 제공
    // null 검사를 통과한 후에는 non-null 타입으로 간주됨
    printLengthIfNotNull("123")

    // lazy는 변수가 처음으로 호출될 때 초기화됨
    val lazyVar: String by lazy {
        "지연 초기화"
    }

    fun printLazyVar() {
        println(lazyVar)
    }
    
    printLazyVar()

}

fun printLength(str: String?) {
    println(str?.length) // null이면 null을 출력, 그렇지 않으면 길이 출력
}

fun getLengthOrDefault(str: String?): Int {
    return str?.length ?: 0 // str이 null이면 0을 반환
}

fun castToString(any: Any?): String? {
    return any as? String // any가 String 타입이면 캐스팅, 아니면 null
}

fun forceNotNull(str: String?) {
    val length = str!!.length // str이 null이면 예외 발생
    println(length)
}

fun printLengthIfNotNull(str: String?) {
    if (str != null)
        println(str.length) // 스마트 캐스트로 str을 non-null로 처리
}

