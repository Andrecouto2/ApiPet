package com.api.petmeet.services.controller

import com.api.petmeet.services.model.PetVideo
import com.api.petmeet.services.service.PetVideoServices
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*
import java.util.*

@RestController
@CrossOrigin
@RequestMapping(value = "/petvideo")
class PetVideoController {

    @Autowired
    lateinit var petVideoServices : PetVideoServices

    @GetMapping
    fun getAll(): List<PetVideo> {
        return petVideoServices.getAllPetVideos()
    }

    @GetMapping("{id}")
    fun getVideo(@PathVariable("id") id : String) : Optional<PetVideo>? {
        return petVideoServices.getPetVideo(id)
    }

    @GetMapping("{idpet}")
    fun getPetVideosByIdPet(idPet: String) : List<PetVideo> {
        return petVideoServices.getPetVideosByIdPet(idPet)
    }

    @PostMapping
    fun save(@RequestBody petvideo: PetVideo) {
        petVideoServices.save(petvideo)
    }

    @DeleteMapping("{id}")
    fun delete(@PathVariable("id") id : String) {
        petVideoServices.delete(id)
    }
}