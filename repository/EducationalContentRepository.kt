package repository

import model.AcademicFormation
import model.EducationalContent
import utils.Level

object EducationalContentRepository{
    private fun contentListOfCourse(): List<EducationalContent>{
        return listOf(
             EducationalContent("Princípios OO", 15L, Level.INICIANTE),
             EducationalContent("Funções", 25L, Level.INICIANTE),
             EducationalContent("Coroutines", 15L, Level.INTERMEDIARIO),
             EducationalContent("Testes", 25L, Level.INTERMEDIARIO),
             EducationalContent("Boas práticas", 25L, Level.AVANÇADO),
             EducationalContent("SOLID", 35L, Level.AVANÇADO),
        )
    }

    fun academicFormationsList(): List<AcademicFormation>{
        return listOf(
            AcademicFormation("Bootcamp Kotlin", contentListOfCourse().subList(0, 3)),
            AcademicFormation("Bootcamp Kotlin Avançado", contentListOfCourse().subList(3, 6))
        )
    }
}
