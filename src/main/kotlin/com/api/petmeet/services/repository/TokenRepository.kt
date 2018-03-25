package com.api.petmeet.services.repository

import com.api.petmeet.services.model.Token
import org.springframework.data.mongodb.repository.MongoRepository
import org.springframework.stereotype.Repository

@Repository
interface TokenRepository : MongoRepository<Token, String>