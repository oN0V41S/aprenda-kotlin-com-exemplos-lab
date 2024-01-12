// [Template no Kotlin Playground](https://pl.kotl.in/WcteahpyN)

enum class Nivel { BASICO, INTERMEDIARIO, DIFICIL }

class Usuario(nome: String, email: String)

data class ConteudoEducacional(var nome: String, val duracao: Int = 60)

data class Formacao(val nome: String, var conteudos: List<ConteudoEducacional>) {

    val inscritos = mutableListOf<Usuario>()

    fun getInfo(){
        println(" Informação da Formação \n nome: $nome \n Conteudos: ${inscritos}")
    }
    fun getInscritos(){ for (user in inscritos) { println(user) } }
    
    fun matricular(usuario: Usuario) {
        inscritos.add(usuario)
    }
}

fun main() {

    val kotlinconteudos = listOf(ConteudoEducacional("Introducao Kotlin",60), ConteudoEducacional("Controle de FLuxo", 60))
    val cursoKotlin = Formacao("Kotlin", kotlinconteudos )
    val user1 = Usuario("Rafael N0vais","Rafael@gmail.com")
    cursoKotlin.matricular(user1)
    cursoKotlin.getInfo()
}
