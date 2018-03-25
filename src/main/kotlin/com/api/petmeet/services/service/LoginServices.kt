package com.api.petmeet.services.service


import com.api.petmeet.services.model.Login
import com.api.petmeet.services.repository.LoginRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import java.util.*

@Service
class LoginServices {

    @Autowired
    lateinit var loginRepository : LoginRepository

    fun getAllLogin() : List<Login> {
        return loginRepository.findAll()
    }

    fun getLogin(id: String) : Optional<Login>? {
        return loginRepository.findById(id)
    }

    fun save(login: Login) {
        loginRepository.save(login)
    }

    fun delete(id: String) {
        loginRepository.deleteById(id)
    }
}
