package com.gonexwind.myapp.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.gonexwind.myapp.R
import com.gonexwind.myapp.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {

    private var _binding: FragmentHomeBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.apply {
            segitigaButton.setOnClickListener {
                findNavController().navigate(R.id.action_homeFragment_to_segitigaFragment)
            }
            persegiButton.setOnClickListener {
                findNavController().navigate(R.id.action_homeFragment_to_persegiFragment)
            }
            kalkulatorButton.setOnClickListener {
                findNavController().navigate(R.id.action_homeFragment_to_kalkulatorFragment)
            }
            aboutButton.setOnClickListener {
                findNavController().navigate(R.id.action_homeFragment_to_aboutFragment)
            }
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}