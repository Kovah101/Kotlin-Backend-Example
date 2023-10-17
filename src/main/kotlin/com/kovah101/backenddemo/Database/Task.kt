package com.kovah101.backenddemo.Database

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.Id


@Entity
data class Task(
    @Id @GeneratedValue
    val id: Long,
    val name: String,
    val description: String,
    val complexity: Complexity
)

enum class Complexity {
    EASY, MEDIUM, HARD
}
