package com.app.lab3.repository

import com.app.lab3.dao.StudentDao
import com.app.lab3.model.Student

class StudentRepository(private val studentDao: StudentDao) {
    suspend fun clearStudents() {
        studentDao.deleteAllStudents()
    }

    suspend fun insertStudent(student: Student) {
        studentDao.insertStudent(student)
    }

    suspend fun insertStudents(students: List<Student>) {
        studentDao.insertStudents(students)
    }

    suspend fun updateStudent(student: Student) {
        studentDao.updateStudent(student)
    }

    suspend fun deleteStudent(student: Student) {
        studentDao.deleteStudent(student)
    }

    suspend fun getAllStudents(): List<Student> {
        return studentDao.getAllStudents()
    }
}