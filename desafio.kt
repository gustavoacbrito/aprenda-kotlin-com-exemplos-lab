// [Template no Kotlin Playground](https://pl.kotl.in/WcteahpyN)

enum class Level { BASICO, INTERMEDIARIO, DIFICIL }
data class User(val id: Int , val name: String)
data class EducationalContent(val name: String, val duration: Int , val level: Level)
data class Course(val name: String, var content: List<EducationalContent>) {
    val subscribed = mutableListOf<User>()
    fun enroll(user: User) {
        subscribed.add(user)
    }
}

fun main() {
    val contents: List<EducationalContent> = listOf(EducationalContent("Conhecendo o Kotlin e Sua Documentação Oficial",120, Level.BASICO),
        EducationalContent("Tratamento de exceções em Kotlin",60, Level.INTERMEDIARIO),
        EducationalContent("Adicionando Segurança a uma API REST com Spring Security",240, Level.DIFICIL))
    val user = User(1, "Rubens Ramos")
    val kotlinCourse = Course("Kotlin", contents)
    kotlinCourse.enroll(user)

    println(kotlinCourse)
    for (item in kotlinCourse.subscribed){
        println(item)
    }
}
