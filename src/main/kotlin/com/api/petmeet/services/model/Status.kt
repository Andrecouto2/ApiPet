package com.api.petmeet.services.model

import org.springframework.data.annotation.Id

data class Status(@Id val id: String?,
                  var deion: String,
                  var icon: String)