package com.api.petmeet.services.controller

import com.api.petmeet.services.model.Token
import com.api.petmeet.services.service.TokenServices
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*
import java.util.*

@RestController
@CrossOrigin
@RequestMapping(value = "/token")
class TokenController {

    @Autowired
    lateinit var tokenServices : TokenServices

    @GetMapping
    fun getAll(): List<Token> {
        return tokenServices.getAllToken()
    }

    @GetMapping("{id}")
    fun getToken(@PathVariable("id") id : String) : Optional<Token>? {
        return tokenServices.getToken(id)
    }

    @PostMapping
    fun save(@RequestBody token: Token) {
        tokenServices.save(token)
    }

    @DeleteMapping("{id}")
    fun delete(@PathVariable("id") id : String) {
        tokenServices.delete(id)
    }
}