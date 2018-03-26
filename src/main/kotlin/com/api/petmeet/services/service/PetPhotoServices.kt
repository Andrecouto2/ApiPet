package com.api.petmeet.services.service

import com.api.petmeet.services.model.PetPhoto
import com.api.petmeet.services.model.PetStatus
import com.api.petmeet.services.repository.PetPhotoRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import java.util.*

@Service
class PetPhotoServices {

    @Autowired
    lateinit var petPhotoRepository : PetPhotoRepository

    fun getAllPetPhotos() : List<PetPhoto> {
        return petPhotoRepository.findAll()
    }

    fun getPetPhoto(id: String) : Optional<PetPhoto>? {
        return petPhotoRepository.findById(id)
    }

    fun getPetPhotosByIdPet(idPet: String) : List<PetPhoto> {
        return petPhotoRepository.findByIdPet(idPet)
    }

    fun save(petPhoto: PetPhoto) {
        petPhotoRepository.save(petPhoto)
    }

    fun delete(id: String) {
        petPhotoRepository.deleteById(id)
    }
}