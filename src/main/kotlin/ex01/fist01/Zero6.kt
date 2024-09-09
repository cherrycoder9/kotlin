package ex01.fist01

// 사용자의 이름과 이메일 가지는 클래스 생성
// 이 클래스를 사용하면 main() 함수에서 먼저 사용자 이름과 이메일을 초기화없이 접근하려 시도
// 이후 적절한 값을 초기화한 후 출력 진행, 초기화 전후의 상태 확인하는 로직 추가

class UserProfile {
    // 이름과 이메일을 나중에 초기화할 수 있도록 lateinit var로 선언
    lateinit var name: String
    lateinit var email: String

    // 이름과 이메일을 출력하는 함수
    // 이때 변수들이 초기화되었는지 확인 후 출력
    fun printUserProfile() {
        // '::변수명.isInitialized'는 lateinit 변수의 초기화 여부를 확인
        // 만약 변수가 초기화되지 않았다면 안내문 출력
        if (::name.isInitialized && ::email.isInitialized) {
            println("사용자 프로필: 이름 - $name, 이메일 - $email")
        } else {
            // 초기화되지 않은 변수에 접근하면 예외가 발생하므로 안전하게 초기화 여부 확인
            if (!::name.isInitialized) println("이름이 초기화되지 않았습니다.")
            if (!::email.isInitialized) println("이메일이 초기화되지 않았습니다.")
        }
    } // End of printUserProfile()
} // End of UserProfile

fun main() {
    // UserProfile 인스턴스 생성
    val userProfile = UserProfile()

    // 초기화하지 않고 printUserProfile() 호출
    println("초기화 전 프로필 출력 시도:")
    userProfile.printUserProfile()

    // 이름과 이메일 초기화
    userProfile.name = "코틀린"
    userProfile.email = "kotlin@kot.lin"
    println("\n이름과 이메일이 초기화 되었습니다.")

    // 초기화 후 printUserProfile() 호출
    println("\n초기화 후 프로필 출력:")
    userProfile.printUserProfile()
}