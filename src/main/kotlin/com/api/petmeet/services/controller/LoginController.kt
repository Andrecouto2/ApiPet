package com.api.petmeet.services.controller

import com.api.petmeet.services.model.Login
import com.api.petmeet.services.service.LoginServices
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*
import java.util.*

@RestController
@CrossOrigin
@RequestMapping(value = "/login")
class LoginController {

    @Autowired
    lateinit var loginServices : LoginServices

    @GetMapping
    fun getAll(): List<Login> {
        return loginServices.getAllLogin()
    }

    @GetMapping("{id}")
    fun getLogin(@PathVariable("id") id : String) : Optional<Login>? {
        return loginServices.getLogin(id)
    }

    @PostMapping
    fun save(@RequestBody login: Login) {
        loginServices.save(login)
    }

    @DeleteMapping("{id}")
    fun delete(@PathVariable("id") id : String) {
       loginServices.delete(id)
    }
}