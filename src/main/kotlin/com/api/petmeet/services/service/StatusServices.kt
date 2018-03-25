package com.api.petmeet.services.service

import com.api.petmeet.services.model.Status
import com.api.petmeet.services.repository.StatusRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import java.util.*

@Service
class StatusServices {

    @Autowired
    lateinit var statusRepository : StatusRepository

    fun getAllStatus() : List<Status> {
        return statusRepository.findAll()
    }

    fun getStatus(id: String) : Optional<Status>? {
        return statusRepository.findById(id)
    }

    fun save(status: Status) {
        statusRepository.save(status)
    }

    fun delete(id: String) {
        statusRepository.deleteById(id)
    }
}