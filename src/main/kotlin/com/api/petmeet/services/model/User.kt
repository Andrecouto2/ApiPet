package com.api.petmeet.services.model

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document
import java.util.*

@Document
data class User(@Id val id: String?,
                    var firstName: String,
                    var surName: String?,
                    var lastName: String,
                    var address: String?,
                    var phone: String?,
                    var cep: String?,
                    var district: String?,
                    var city: String?,
                    var state: String?,
                    var dtCreated: String,
                    var dtUpdated: String?)