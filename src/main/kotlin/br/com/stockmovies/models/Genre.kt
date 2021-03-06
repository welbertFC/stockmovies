package br.com.stockmovies.models

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

@Entity
data class Genre(
        @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
        val id: Long,
        val name: String
)