package com.api.petmeet.services.service

import com.api.petmeet.services.model.Pet
import com.api.petmeet.services.repository.PetRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import java.util.*

@Service
class PetServices {

    @Autowired
    lateinit var petRepository : PetRepository

    fun getAllPets() : List<Pet> {
        return petRepository.findAll()
    }

    fun getPet(id: String) : Optional<Pet>? {
        return petRepository.findById(id)
    }

    fun save(pet: Pet) {
        petRepository.save(pet)
    }

    fun delete(id: String) {
        petRepository.deleteById(id)
    }
}