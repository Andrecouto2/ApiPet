package com.api.petmeet.services.model

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

@Document
data class Status(@Id val id: String?,
                  var deion: String,
                  var icon: String)