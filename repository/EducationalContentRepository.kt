package repository

import model.AcademicFormation
import model.EducationalContent
import utils.Level

object EducationalContentRepository{
    private fun contentListOfCourse(): List<EducationalContent>{
        return listOf(
             EducationalContent("Princípios OO", 15L, Level.BASIC),
             EducationalContent("Funções", 25L, Level.BASIC),
             EducationalContent("Coroutines", 15L, Level.MEDIUM),
             EducationalContent("Testes", 25L, Level.MEDIUM),
             EducationalContent("Boas práticas", 25L, Level.ADVANCED),
             EducationalContent("SOLID", 35L, Level.ADVANCED),
        )
    }

    fun academicFormationsList(): List<AcademicFormation>{
        return listOf(
            AcademicFormation("Bootcamp Kotlin", contentListOfCourse().subList(0, 2)),
            AcademicFormation("Bootcamp Kotlin Avançado", contentListOfCourse().subList(3, 5))
        )
    }
}
