package org.gricsan.dungaran.modules.mainmenu.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import org.gricsan.dungaran.databinding.FragmentMainMenuScreenBinding

class MainMenuScreen : Fragment() {

    private var _binding: FragmentMainMenuScreenBinding? = null
    private val binding get() = _binding!!

    private val viewModel: MainMenuScreenViewModel by viewModels()


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentMainMenuScreenBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setupClickListeners()
    }

    override fun onResume() {
        super.onResume()
        viewModel.onViewReady()
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }


    private fun setupClickListeners() {
        binding.run {
            btnContinueCampaign.setOnClickListener {

            }
            btnStartNewCampaign.setOnClickListener {

            }
        }
    }

}