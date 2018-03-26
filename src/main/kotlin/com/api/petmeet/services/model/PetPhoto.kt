package com.api.petmeet.services.model

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

@Document
data class PetPhoto(@Id val id: String?,
                        var idPet: String,
                        var photo: String,
                        var deion: String,
                        var dtCreated: String,
                        var dtUpdated: String?)