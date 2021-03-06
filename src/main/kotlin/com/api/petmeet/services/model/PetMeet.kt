package com.api.petmeet.services.model

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

@Document
data class PetMeet(@Id val id: String?,
                   var idPet: String,
                   var idPetLiked: String,
                   var petLikedCommented: String?,
                   var dtLiked: String,
                   var flagMeetConfirmed: Boolean?,
                   var dtFlagMeet: String?)