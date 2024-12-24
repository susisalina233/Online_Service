package id.ac.polbeng.susisalina.onlineservice.models

data class LoginResponse (
    val message: String,
    val error: Boolean,
    val data: User
)