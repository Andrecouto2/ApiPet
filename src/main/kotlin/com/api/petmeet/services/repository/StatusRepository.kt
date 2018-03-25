package com.api.petmeet.services.repository

import com.api.petmeet.services.model.Status
import org.springframework.data.mongodb.repository.MongoRepository
import org.springframework.stereotype.Repository

@Repository
interface StatusRepository : MongoRepository<Status, String>