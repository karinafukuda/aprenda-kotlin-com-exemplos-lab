import model.User
import repository.AcademicFormationRepository
import repository.EducationalContentRepository

fun main() {

    val user01 = User("Karina", "email@com", "1234")
    val user02 = User("Carlos", "email@com", "1234")

    val formations = EducationalContentRepository

    val academicFormationRepository = AcademicFormationRepository()

    academicFormationRepository.toSubscribedAndPrintIt(user01, formations.academicFormationsList()[0])
    academicFormationRepository.toSubscribedAndPrintIt(user02,formations.academicFormationsList()[1])

    /**
     * Output:
     *   Aluno(a) Karina matriculado(a) na DIO com sucesso! A formação selecionada foi Bootcamp Kotlin
     *   Conteúdo desta formação: Princípios OO duração de 15 minutos e dificuldade INICIANTE
     *   Conteúdo desta formação: Funções duração de 25 minutos e dificuldade INICIANTE
     *   Aluno(a) Carlos matriculado(a) na DIO com sucesso! A formação selecionada foi Bootcamp Kotlin Avançado
     *   Conteúdo desta formação: Testes duração de 25 minutos e dificuldade INTERMEDIARIO
     *   Conteúdo desta formação: Boas práticas duração de 25 minutos e dificuldade AVANÇADO
     */
}
