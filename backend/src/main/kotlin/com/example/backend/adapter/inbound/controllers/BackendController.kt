package com.example.backend.adapter.inbound.controllers

import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("v1")
class BackendController {

    @GetMapping("greetings")
    fun greeting(): ResponseEntity<Any> {
        return ResponseEntity.ok(object {
            val message: String = "Greetings"
        })
    }
}