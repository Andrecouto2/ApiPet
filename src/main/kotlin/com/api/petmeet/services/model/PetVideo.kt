package com.api.petmeet.services.model

import org.springframework.data.annotation.Id

data class PetVideo(@Id val id: String?,
                    var idPet: String,
                    var video: String,
                    var deion: String,
                    var dtCreated: String,
                    var dtUpdated: String?)