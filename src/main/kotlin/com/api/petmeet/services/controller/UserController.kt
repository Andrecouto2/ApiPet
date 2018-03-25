package com.api.petmeet.services.controller

import com.api.petmeet.services.model.User
import com.api.petmeet.services.service.UserServices
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

@RestController
@CrossOrigin
@RequestMapping(value = "/user")
class UserController {

    @Autowired
    lateinit var gameServices : UserServices

    @GetMapping
    fun getAll(): List<User> {
        return gameServices.getAllUser()
    }

    @PostMapping
    fun save(@RequestBody user: User) {
        gameServices.save(user)
    }

    /*@GetMapping(value = "/titulo/{titulo}")
    fun buscarPor(@PathVariable(value = "titulo") titulo: String) : List<Game> {
        return gameServices.buscarPor(nome = titulo)
    }*/

    @DeleteMapping("{id}")
    fun delete(@PathVariable("id") id : String) {
        gameServices.delete(id)
    }
}