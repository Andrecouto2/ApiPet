package com.api.petmeet.services.repository

import com.api.petmeet.services.model.Pet
import org.springframework.data.mongodb.repository.MongoRepository
import org.springframework.stereotype.Repository

@Repository
interface PetRepository : MongoRepository<Pet, String>