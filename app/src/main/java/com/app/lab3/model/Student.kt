package com.app.lab3.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import java.time.LocalDate
import java.util.Date

@Entity(
    tableName = "students"
)

data class Student(
    @ColumnInfo(name = "first_name")
    val firstName: String,
    @ColumnInfo(name = "second_name")
    val secondName: String,
    @ColumnInfo(name = "birth_date")
    val birthDate: String,
    @ColumnInfo(name = "phone")
    val phoneNumber: String,
    @ColumnInfo(name = "average_rating")
    val averageRating: Double
) {
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "student_id")
    var student_id: Long = 0
}
