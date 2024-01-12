// [Template no Kotlin Playground](https://pl.kotl.in/WcteahpyN)

enum class Nivel { BASICO, INTERMEDIARIO, DIFICIL }

class Usuario(val nome: String, val email: String)

data class ConteudoEducacional(val nome: String, val duracao: Int)

data class Formacao(val nome: String, var conteudos: List<ConteudoEducacional>) {

    val inscritos = mutableListOf<Usuario>()

    // Função para obter todas informações do curso
    fun getInfo(){
        println(" Informação da Formação \n nome: $nome \n Conteúdos:")
        conteudos.forEach {conteudo -> println("	nome:${conteudo.nome} \n	duracao: ${conteudo.duracao} \n")}
    }

    // Função para obter alunos incritos no curso
    fun getInscritos(){
        println(" Usuários: ")
        inscritos.forEach{ user -> println("	nome: ${user.nome} \n	email: ${user.email} \n") }
    }

    // Função para matricular um aluno ao curso
    fun matricular(usuario: Usuario) {
        inscritos.add(usuario)
    }
}

fun main() {

    // Adicionando conteudos a lista
    val kotlinconteudos = listOf(ConteudoEducacional("Introdução kotlin", 60), ConteudoEducacional("Controle de FLuxo", 60))

    // Criando Formação
    val cursoKotlin = Formacao("Kotlin", kotlinconteudos )

    // Obtendo Informações do Curso
    cursoKotlin.getInfo()

    var rafael = Usuario("Rafael Novais","rafael@gmail.com")
    var lucas = Usuario("Lucas Novaes", "lucas@gmail.com")

    //Matriculando Alunos
    cursoKotlin.matricular(rafael)
    cursoKotlin.matricular(lucas)

    // Obtendo todos inscritos no curso
    cursoKotlin.getInscritos()
}
