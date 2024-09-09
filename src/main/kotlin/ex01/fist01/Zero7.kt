package ex01.fist01

// const val과 val 차이 이해하기
// 클래스를 만들고 서버 url, 현재 서버 상태를 표현하는 변수 선언
// 서버 상태는 프로그램 실행 시 동적으로 변경됨
// 서버 상태를 변경하는 메서드 작성

// object는 싱글톤 패턴을 사용해 애플리케이션에서 한 번만 생성되는 객체를 만든다
// 프로그램 전체에서 하나의 인스턴스만 존재, 모든 클래스에서 접근할 수 있음
// 코틀린에서 object는 싱글톤 패턴을 구현하는 특별한 개념임
// 인스턴스화 없이 바로 접근할 수 있음
// 여러 쓰레드에서 안전하게 사용할 수 있는 방식으로 설계됨
// 전역설정 객체나 유틸리티 클래스처럼 하나의 인스턴스를 전역에서 공유할때 적합
// 앱 설정, 로깅, 전역 상태 관리 등
object AppConfig {
    // const val은 컴파일 타임에 값이 할당되며 변경 불가능
    const val BASE_URL: String = "https://api.kotlin.com"

    // 프로그램 실행 중 상태를 변경할 수 있음
    var serverStatus: String = "OFFLINE"

    // 서버 상태를 변경하는 함수. 외부에서 상태를 변경할 수 있도록 설계
    // 코틀린에서는 클래스나 object 안에 var로 선언된 가변 변수에 대해 자동으로
    // getter와 setter가 생성됨. 따라서 아래 함수 이름은 충돌이 발생하므로 주석 처리
    // val로 선언된 불변 변수의 경우 getter만 자동으로 생성됨
    //fun setServerStatus(status: String) {
    //    serverStatus = status
    //}
    fun updateServerStatus(status: String) {
        serverStatus = status
    }
} // End of AppConfig

fun main() {
    // 프로그램 실행 시 처음 BASE_URL과 서버 상태를 출력
    println("서버 URL: ${AppConfig.BASE_URL}")
    println("서버 상태(초기): ${AppConfig.serverStatus}")

    // 서버 상태를 ONLINE으로 변경
    AppConfig.updateServerStatus("ONLINE")

    // 변경된 서버 상태 출력
    println("서버 상태(변경 후): ${AppConfig.serverStatus}")
}