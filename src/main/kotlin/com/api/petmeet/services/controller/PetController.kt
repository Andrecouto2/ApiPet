package com.api.petmeet.services.controller

import com.api.petmeet.services.model.Pet
import com.api.petmeet.services.service.PetServices
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*
import java.util.*

@RestController
@CrossOrigin
@RequestMapping(value = "/pet")
class PetController {

    @Autowired
    lateinit var petServices : PetServices

    @GetMapping
    fun getAll(): List<Pet> {
        return petServices.getAllPets()
    }

    @GetMapping("{id}")
    fun getPet(@PathVariable("id") id : String) : Optional<Pet>? {
        return petServices.getPet(id)
    }

    @PostMapping
    fun save(@RequestBody pet: Pet) {
        petServices.save(pet)
    }

    @DeleteMapping("{id}")
    fun delete(@PathVariable("id") id : String) {
        petServices.delete(id)
    }
}