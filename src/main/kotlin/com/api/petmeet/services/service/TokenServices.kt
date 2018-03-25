package com.api.petmeet.services.service

import com.api.petmeet.services.model.PetStatus
import com.api.petmeet.services.model.Token
import com.api.petmeet.services.repository.TokenRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import java.util.*

@Service
class TokenServices {

    @Autowired
    lateinit var tokenRepository : TokenRepository

    fun getAllToken() : List<Token>{
        return tokenRepository.findAll()
    }

    fun getToken(id: String) : Optional<Token>? {
        return tokenRepository.findById(id)
    }

    fun save(token: Token) {
        tokenRepository.save(token)
    }

    fun delete(id: String) {
        tokenRepository.deleteById(id)
    }
}