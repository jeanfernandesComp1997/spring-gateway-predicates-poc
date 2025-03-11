package com.example.backend

import org.springframework.stereotype.Component

@Component
class UnlocksStrategyFactory(
    private val unlocksWithCryptoCorpUseCase: UnlocksWithCryptoCorpUseCase,
    private val unlocksDefaultUseCase: UnlocksDefaultUseCase,
) {

    val unlocksServiceWithCryptoCorp = UnlocksService(unlocksWithCryptoCorpUseCase)
    val unlocksServiceDefault = UnlocksService(unlocksDefaultUseCase)

    fun getUnlocksService(useCryptoCorp: Boolean): UnlocksUseCase {
        return when (useCryptoCorp) {
            true -> unlocksServiceWithCryptoCorp
            else -> unlocksServiceDefault
        }
    }
}