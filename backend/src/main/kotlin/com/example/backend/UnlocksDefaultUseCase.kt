package com.example.backend

import org.springframework.stereotype.Component

@Component
class UnlocksDefaultUseCase : UnlocksUseCase {

    override fun unlocks(): String {
        return "Default unlocked"
    }
}
