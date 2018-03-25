package com.api.petmeet.services.controller

import com.api.petmeet.services.model.PetPhoto
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
    lateinit var petvideoServices : PetVideoServices

    @GetMapping
    fun getAll(): List<PetVideo> {
        return petvideoServices.getAllPetVideos()
    }

    @GetMapping("{id}")
    fun getVideo(@PathVariable("id") id : String) : Optional<PetVideo>? {
        return petvideoServices.getPetVideo(id)
    }

    @PostMapping
    fun save(@RequestBody petvideo: PetVideo) {
        petvideoServices.save(petvideo)
    }

    @DeleteMapping("{id}")
    fun delete(@PathVariable("id") id : String) {
        petvideoServices.delete(id)
    }
}