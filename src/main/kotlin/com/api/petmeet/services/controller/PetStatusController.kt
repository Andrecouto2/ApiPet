package com.api.petmeet.services.controller

import com.api.petmeet.services.model.PetStatus
import com.api.petmeet.services.service.PetStatusServices
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*
import java.util.*

@RestController
@CrossOrigin
@RequestMapping(value = "/petstatus")
class PetStatusController {

    @Autowired
    lateinit var petStatusServices : PetStatusServices

    @GetMapping
    fun getAll(): List<PetStatus> {
        return petStatusServices.getAllPetStatus()
    }

    @GetMapping("{id}")
    fun getPetStatus(@PathVariable("id") id : String) : Optional<PetStatus>? {
        return petStatusServices.getPetStatus(id)
    }

    @PostMapping
    fun save(@RequestBody petstatus: PetStatus) {
        petStatusServices.save(petstatus)
    }

    @DeleteMapping("{id}")
    fun delete(@PathVariable("id") id : String) {
        petStatusServices.delete(id)
    }
}