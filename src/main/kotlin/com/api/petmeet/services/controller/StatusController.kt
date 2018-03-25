package com.api.petmeet.services.controller

import com.api.petmeet.services.model.Status
import com.api.petmeet.services.service.StatusServices
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*
import java.util.*

@RestController
@CrossOrigin
@RequestMapping(value = "/status")
class StatusController {

    @Autowired
    lateinit var statusServices : StatusServices

    @GetMapping
    fun getAll(): List<Status> {
        return statusServices.getAllStatus()
    }

    @GetMapping("{id}")
    fun getStatus(@PathVariable("id") id : String) : Optional<Status>? {
        return statusServices.getStatus(id)
    }

    @PostMapping
    fun save(@RequestBody petstatus: Status) {
        statusServices.save(petstatus)
    }

    @DeleteMapping("{id}")
    fun delete(@PathVariable("id") id : String) {
        statusServices.delete(id)
    }
}