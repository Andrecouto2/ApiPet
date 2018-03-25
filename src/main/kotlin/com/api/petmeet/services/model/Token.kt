package com.api.petmeet.services.model

import org.springframework.data.annotation.Id

data class Token(@Id val id: String?,
                     var deion: String)