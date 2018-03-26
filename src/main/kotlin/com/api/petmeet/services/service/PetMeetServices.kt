package com.api.petmeet.services.service

import com.api.petmeet.services.model.PetMeet
import com.api.petmeet.services.repository.PetMeetRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import java.util.*

@Service
class PetMeetServices {

    @Autowired
    lateinit var petMeetRepository : PetMeetRepository

    fun getAllPetMeet() : List<PetMeet> {
        return petMeetRepository.findAll()
    }

    fun getPetMeet(id: String) : Optional<PetMeet>? {
        return petMeetRepository.findById(id)
    }

    fun getPetMeetByIdPet(idPet: String) : List<PetMeet> {
        return petMeetRepository.findByIdPet(idPet)
    }

    fun save(petMeet: PetMeet) {
        petMeetRepository.save(petMeet)
    }

    fun delete(id: String) {
        petMeetRepository.deleteById(id)
    }
}