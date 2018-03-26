package com.api.petmeet.services.service

import com.api.petmeet.services.model.PetStatus
import com.api.petmeet.services.repository.PetStatusRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import java.util.*

@Service
class PetStatusServices {

    @Autowired
    lateinit var petStatusRepository : PetStatusRepository

    fun getAllPetStatus() : List<PetStatus> {
        return petStatusRepository.findAll()
    }

    fun getPetStatus(id: String) : Optional<PetStatus>? {
        return petStatusRepository.findById(id)
    }

    fun getPetStatusByIdPet(idPet: String) : List<PetStatus> {
        return petStatusRepository.findByIdPet(idPet)
    }

    fun save(petStatus: PetStatus) {
        petStatusRepository.save(petStatus)
    }

    fun delete(id: String) {
        petStatusRepository.deleteById(id)
    }
}