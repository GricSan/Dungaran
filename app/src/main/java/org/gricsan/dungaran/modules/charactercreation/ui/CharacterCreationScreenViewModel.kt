package org.gricsan.dungaran.modules.charactercreation.ui

import androidx.lifecycle.ViewModel
import org.gricsan.dungaran.modules.charactercreation.usecases.CharacterCreationScreenUseCases

class CharacterCreationScreenViewModel : ViewModel() {

    private val useCases = CharacterCreationScreenUseCases()


    fun onViewReady() {

    }

}