package com.api.petmeet.services.controller

import com.api.petmeet.services.model.PetMeet
import com.api.petmeet.services.service.PetMeetServices
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*
import java.util.*

@RestController
@CrossOrigin
@RequestMapping(value = "/petmeet")
class PetMeetController {

    @Autowired
    lateinit var petMeetServices : PetMeetServices

    @GetMapping
    fun getAll(): List<PetMeet> {
        return petMeetServices.getAllPetMeet()
    }

    @GetMapping("{id}")
    fun getPetMeet(@PathVariable("id") id : String) : Optional<PetMeet>? {
        return petMeetServices.getPetMeet(id)
    }

    @GetMapping("{idpet}")
    fun getAllPetsByUser(@RequestParam("idpet") idPet: String): List<PetMeet> {
        return petMeetServices.getPetMeetByIdPet(idPet)
    }

    @PostMapping
    fun save(@RequestBody petmeet: PetMeet) {
        petMeetServices.save(petmeet)
    }

    @DeleteMapping("{id}")
    fun delete(@PathVariable("id") id : String) {
        petMeetServices.delete(id)
    }
}