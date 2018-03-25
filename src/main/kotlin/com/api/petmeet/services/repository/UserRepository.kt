package com.api.petmeet.services.repository

import com.api.petmeet.services.model.User
import org.springframework.data.mongodb.repository.MongoRepository
import org.springframework.stereotype.Repository

@Repository
interface UserRepository : MongoRepository<User, String> {

    fun findByFirstNameIgnoreCaseContaining(nome: String) : List<User>
}