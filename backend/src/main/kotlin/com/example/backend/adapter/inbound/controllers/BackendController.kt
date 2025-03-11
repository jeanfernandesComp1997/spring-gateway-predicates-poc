package com.example.backend.adapter.inbound.controllers

import com.example.backend.UnlocksStrategyFactory
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("v1")
class BackendController(
    private val unlocksStrategyFactory: UnlocksStrategyFactory
) {

    @GetMapping("greetings")
    fun greeting(): ResponseEntity<Any> {
        return ResponseEntity.ok(object {
            val message: String = "Greetings"
        })
    }

    @GetMapping("unlocks")
    fun unlocks(@RequestParam cryptoCorp: Boolean = false): ResponseEntity<String> {
        return unlocksStrategyFactory.getUnlocksService(cryptoCorp).let { unlockService ->
            ResponseEntity.ok(unlockService.unlocks())
        }
    }
}