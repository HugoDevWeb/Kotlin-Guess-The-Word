package com.example.android.guesstheword.screens.game

import android.util.Log
import androidx.lifecycle.ViewModel

class GameViewModel : ViewModel(){

    private lateinit var viewModel: GameViewModel
    init {
        Log.i("GameViewModel", "GameViewModel created !")
    }

    override fun onCleared() {
        super.onCleared()
        Log.i("GameViewModel" , "GameViewModel Destroyed")
    }
}