package com.api.petmeet.services.model

import org.springframework.data.annotation.Id

data class PetStatus(@Id val id: String?,
                         var idPet: String,
                         var idStatus: String,
                         var dtCreated: String,
                         var dtUpdated: String?)