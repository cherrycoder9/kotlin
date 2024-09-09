package ex01.fist01

// ShoppingCart 클래스는 가변 리스트인 items를 가짐
class ShoppingCart {
    // items 리스트는 MutableList로 선언되어 언제든 아이템을 추가하거나 제거할 수 있음
    // mutableListOf(): 표준 라이브러리 함수, 가변리스트를 생성하는 함수
    // 이 함수는 호출시 지정된 타입의 빈 리스트 또는 초기값이 있는 리스트를 반환함
    var items: MutableList<String> = mutableListOf()

    // addItem 메서드는 items 리스트에 새로운 아이템을 추가하는 역할
    fun addItem(item: String) {
        items.add(item) // 아이템을 리스트에 추가
    }

    // showItems 메서드는 현재 items 리스트에 있는 아이템들을 출력함
    fun showItems() {
        println("현재 장바구니에 있는 아이템들: $items")
    }
}

fun main() {
    // 불변 참조로 선언된 ShoppingCart 객체
    val shoppingCart1 = ShoppingCart()
    // 가변 참조로 선언된 ShoppingCart 객체
    var shoppingCart2 = ShoppingCart()

    // shoppingCart1에 아이템 추가
    shoppingCart1.addItem("사과")
    shoppingCart1.addItem("바나나")

    // shoppingCart2에 아이템 추가
    shoppingCart2.addItem("오렌지")
    shoppingCart2.addItem("포도")

    // 각 장바구니의 아이템들을 출력
    println("shoppingCart1: ")
    shoppingCart1.showItems()

    println("shoppingCart2: ")
    shoppingCart2.showItems()

    // shoppingCart2를 새로운 ShoppingCart 객체로 재할당
    shoppingCart2 = ShoppingCart()

    // shoppingCart2에 새로운 아이템 추가
    shoppingCart2.addItem("복숭아")

    // shoppingCart1의 상태는 유지되지만, shoppingCart2는
    // 새로운 객체가 되었기 때문에 기존 아이템이 사라짐
    println("shoppingCart2를 새로 재할당한 후 상태: ")
    shoppingCart2.showItems()

    // shoppingCart1의 상태를 다시 확인
    println("shoppingCart1의 상태 (변경되지 않음): ")
    shoppingCart1.showItems()
}