package com.example.criminalintent

import androidx.room.Entity
import androidx.room.PrimaryKey
import java.util.*
import java.util.Date //TODO: Check if I need this if I have the above.

@Entity
data class Crime(@PrimaryKey val id: UUID = UUID.randomUUID(),
                 var title: String = "",
                 var date: Date = Date(),
                 var isSolved: Boolean = false)
