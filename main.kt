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
     * Aluno(a) Karina matriculado(a) na DIO com sucesso! A formação selecionada foi Bootcamp Kotlin
     * Conteúdo [EducationalContent(course=Princípios OO, duration=15, level=BASIC), EducationalContent(course=Funções, duration=25, level=BASIC)]
     * Aluno(a) Carlos matriculado(a) na DIO com sucesso! A formação selecionada foi Bootcamp Kotlin Avançado
     * Conteúdo [EducationalContent(course=Boas práticas, duration=25, level=ADVANCED)]
     * todo - Tratar os dados da lista de conteúdo
     */
}
