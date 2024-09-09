package ex01.fist01

// val로 선언된 변수는 참조 자체는 불변이지만, 참조된 객체의 상태는 변경 가능
// val로 선언된 컬렉션이나 객체의 내부 상태는 변경할 수 있음

fun main() {
    // MutableList는 변경 가능한 리스트를 제공하는 인터페이스임
    // 리스트의 요소를 추가, 수정, 삭제할 수 있는 리스트 컬렉션
    // 반면에 List는 읽기 전용 리스트로 요소의 변경이 불가능함
    val mutableList: MutableList<String> = mutableListOf("사과", "바나나")
    println("리스트 초기값: $mutableList")

    // val로 선언된 리스트 참조는 불변이지만, 내부 요소는 변경 가능
    mutableList.add("체리")
    println("리스트 수정 후: $mutableList")
}