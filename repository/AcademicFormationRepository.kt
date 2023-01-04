package repository

import model.AcademicFormation
import model.User
import org.jetbrains.annotations.NotNull

class AcademicFormationRepository {

    @NotNull
    private var subscribed = mutableListOf<User>()
    private var subscribedOnCourses = mutableListOf<AcademicFormation>()

    internal fun toSubscribedAndPrintIt(user: User, academicFormation: AcademicFormation) {
        subscribed.add(user)
        subscribedOnCourses.add(academicFormation)
        println(
            "Aluno(a) ${user.name} matriculado(a) na DIO com sucesso! " +
                    "A formação selecionada foi ${academicFormation.nameOfFormation}"
        )
        academicFormation.contentsOfFormation.forEach {
            println(
                "Conteúdo ${academicFormation.contentsOfFormation.indexOf(it) + 1}  " +
                        "desta formação: ${it.course}, duração de ${it.duration} " +
                        "minutos e dificuldade ${it.level}"
            )
        }
    }
}