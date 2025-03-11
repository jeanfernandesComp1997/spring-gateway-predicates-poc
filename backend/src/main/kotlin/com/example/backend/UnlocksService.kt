package com.example.backend

class UnlocksService(
    private val unlocksUseCase: UnlocksUseCase
) : UnlocksUseCase {

    init {
        println("UnlocksService instantiated")
    }

    override fun unlocks(): String {
        return unlocksUseCase.unlocks().also {
            println("Unlocks cached")
        }
    }
}