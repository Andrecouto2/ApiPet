package com.api.petmeet.services.model

import org.springframework.data.annotation.Id

data class Login(@Id val id: String?,
                     var idToken: String?,
                     var idUser: String?,
                     var userName: String,
                     var password: String,
                     var photoBase64: String?,
                     var photoUrl: String?,
                     var dtCreated: String,
                     var dtUpdated: String)