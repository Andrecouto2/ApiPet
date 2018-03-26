package com.api.petmeet.services.controller

import com.api.petmeet.services.model.PetPhoto
import com.api.petmeet.services.service.PetPhotoServices
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*
import java.util.*

@RestController
@CrossOrigin
@RequestMapping(value = "/petphoto")
class PetPhotoController {

    @Autowired
    lateinit var petPhotoServices : PetPhotoServices

    @GetMapping
    fun getAll(): List<PetPhoto> {
        return petPhotoServices.getAllPetPhotos()
    }

    @GetMapping("{id}")
    fun getPhoto(@PathVariable("id") id : String) : Optional<PetPhoto>? {
        return petPhotoServices.getPetPhoto(id)
    }

    @GetMapping("{idpet}")
    fun getPetPhotosByIdPet(idPet: String) : List<PetPhoto> {
        return petPhotoServices.getPetPhotosByIdPet(idPet)
    }

    @PostMapping
    fun save(@RequestBody petphoto: PetPhoto) {
        petPhotoServices.save(petphoto)
    }

    @DeleteMapping("{id}")
    fun delete(@PathVariable("id") id : String) {
        petPhotoServices.delete(id)
    }
}