package org.gricsan.dungaran.modules.charactercreation.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import org.gricsan.dungaran.databinding.FragmentCharacterCreationScreenBinding

class CharacterCreationScreen : Fragment() {

    private var _binding: FragmentCharacterCreationScreenBinding? = null
    private val binding get() = _binding!!

    private val viewModel: CharacterCreationScreenViewModel by viewModels()


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentCharacterCreationScreenBinding.inflate(layoutInflater, container, false)
        return binding.root
    }

    override fun onResume() {
        super.onResume()
        viewModel.onViewReady()
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }

}