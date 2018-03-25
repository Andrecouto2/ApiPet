package com.api.petmeet.services.repository

import com.api.petmeet.services.model.PetMeet
import org.springframework.data.mongodb.repository.MongoRepository
import org.springframework.stereotype.Repository

@Repository
interface PetMeetRepository : MongoRepository<PetMeet, String>