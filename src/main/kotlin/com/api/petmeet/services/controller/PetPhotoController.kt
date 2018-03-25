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
    lateinit var petphotoServices : PetPhotoServices

    @GetMapping
    fun getAll(): List<PetPhoto> {
        return petphotoServices.getAllPetPhotos()
    }

    @GetMapping("{id}")
    fun getPhoto(@PathVariable("id") id : String) : Optional<PetPhoto>? {
        return petphotoServices.getPetPhoto(id)
    }

    @PostMapping
    fun save(@RequestBody petphoto: PetPhoto) {
        petphotoServices.save(petphoto)
    }

    @DeleteMapping("{id}")
    fun delete(@PathVariable("id") id : String) {
        petphotoServices.delete(id)
    }
}