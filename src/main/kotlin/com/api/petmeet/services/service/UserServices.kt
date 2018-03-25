package com.api.petmeet.services.service

import com.api.petmeet.services.model.User
import com.api.petmeet.services.repository.UserRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class UserServices {

    @Autowired
    lateinit var userRepository : UserRepository

    fun getAllUser() : List<User>{
        return userRepository.findAll()
    }

    fun save(user: User) {
        userRepository.save(user)
    }

    fun delete(id: String) {
        userRepository.deleteById(id)
    }
}