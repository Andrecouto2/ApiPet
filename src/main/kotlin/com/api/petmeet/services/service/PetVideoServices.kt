package com.api.petmeet.services.service

import com.api.petmeet.services.model.PetVideo
import com.api.petmeet.services.repository.PetVideoRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import java.util.*

@Service
class PetVideoServices {

    @Autowired
    lateinit var petVideoRepository : PetVideoRepository

    fun getAllPetVideos() : List<PetVideo> {
        return petVideoRepository.findAll()
    }

    fun getPetVideo(id: String) : Optional<PetVideo>? {
        return petVideoRepository.findById(id)
    }

    fun save(petVideo: PetVideo) {
        petVideoRepository.save(petVideo)
    }

    fun delete(id: String) {
        petVideoRepository.deleteById(id)
    }
}