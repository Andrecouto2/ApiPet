package com.api.petmeet.services.model

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

@Document
data class Pet(@Id val id: String?,
                   var idUser: String,
                   var name: String,
                   var race: String,
                   var specie: String,
                   var genre: String,
                   var size: String?,
                   var weight: String?,
                   var color: String?,
                   var dtBirth: String?,
                   var deion: String?,
                   var aboutMe: String?,
                   var dtCreated: String,
                   var dtUpdated: String?)