package com.api.petmeet.services.repository

import com.api.petmeet.services.model.PetStatus
import org.springframework.data.mongodb.repository.MongoRepository
import org.springframework.stereotype.Repository

@Repository
interface PetStatusRepository : MongoRepository<PetStatus, String> {
    fun findByIdPet(id: String) : List<PetStatus>
}