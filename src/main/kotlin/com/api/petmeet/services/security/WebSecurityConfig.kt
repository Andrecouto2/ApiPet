package com.api.petmeet.services.security

import com.microsoft.azure.spring.autoconfigure.aad.AADAuthenticationFilter
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity
import org.springframework.security.config.annotation.web.builders.HttpSecurity
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter

@EnableGlobalMethodSecurity(securedEnabled = true, prePostEnabled = true)
class WebSecurityConfig : WebSecurityConfigurerAdapter() {
    @Autowired
    private val aadAuthFilter: AADAuthenticationFilter? = null

    @Throws(Exception::class)
    override fun configure(http: HttpSecurity) {
        http.csrf().disable()

        http.addFilterBefore(aadAuthFilter, UsernamePasswordAuthenticationFilter::class.java)
    }
}