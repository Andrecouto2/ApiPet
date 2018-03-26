package com.api.petmeet.services.repository

import com.api.petmeet.services.model.PetVideo
import org.springframework.data.mongodb.repository.MongoRepository
import org.springframework.stereotype.Repository

@Repository
interface PetVideoRepository : MongoRepository<PetVideo, String> {
    fun findByIdPet(id: String) : List<PetVideo>
}