package com.api.petmeet.services.repository

import com.api.petmeet.services.model.PetPhoto
import org.springframework.data.mongodb.repository.MongoRepository
import org.springframework.stereotype.Repository

@Repository
interface PetPhotoRepository : MongoRepository<PetPhoto, String> {
    fun findByIdPet(id: String) : List<PetPhoto>
}