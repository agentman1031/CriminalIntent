package com.example.criminalintent

import java.util.*
import java.util.Date //TODO: Check if I need this if I have the above.

data class Crime(
    val id: UUID = UUID.randomUUID(),
    var title: String = "",
    var date: Date = Date(),
    var isSolved: Boolean = false
)
