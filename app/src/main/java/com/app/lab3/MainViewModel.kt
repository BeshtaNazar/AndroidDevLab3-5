package com.app.lab3

import android.app.Application
import android.os.Build
import androidx.annotation.RequiresApi
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.app.lab3.model.Student
import java.time.LocalDate
import java.util.Date

class MainViewModel(application: Application) : AndroidViewModel(application) {

    private var _myList: MutableLiveData<List<Student>> =
        MutableLiveData<List<Student>>().apply {
            value = emptyList()
        }
    val myList: LiveData<List<Student>> = _myList

    private val studentsList =
        listOf<Student>(
            Student("Назар", "Бешта", "2003-07-06", "380723213448", 76.4),
            Student("Артемій", "Іванов", "1990-01-15", "380971234567", 73.5),
            Student("Ольга", "Петренко", "1985-02-22", "380991234567", 85.2),
            Student("Віталій", "Ковальчук", "1988-05-05", "380951234567", 62.9),
            Student("Ірина", "Сидоренко", "1992-07-10", "380931234567", 97.4),
            Student("Максим", "Григоренко", "1983-10-18", "380921234567", 76.8),
            Student("Юлія","Ковальчук", "1995-09-03","380901234567", 89.1),
            Student("Олександр","Шевченко", "1987-12-14","380881234567", 64.7)
        )
    init{
        _myList.value = studentsList
    }
}