package com.example.backend

import org.springframework.stereotype.Component

@Component
class UnlocksWithCryptoCorpUseCase : UnlocksUseCase {

    override fun unlocks(): String {
        return "Unlocked with crypto corp"
    }
}