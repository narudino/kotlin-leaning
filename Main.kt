class User(val id: Int, var name: String, var email: String?) {

    // ユーザー情報を表示する関数
    fun printUserInfo() {
        println("ID: $id, Name: $name, Email: ${email ?: "No Email"}")
    }
}

fun main() {
    // インスタンスの作成
    val user1 = User(1, "Alice", "alice@example.com")
    val user2 = User(2, "Bob", null) // メールが未設定

    // ユーザー情報を表示
    user1.printUserInfo()
    user2.printUserInfo()
}