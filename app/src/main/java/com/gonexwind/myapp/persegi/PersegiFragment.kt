package com.gonexwind.myapp.persegi

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.view.isVisible
import androidx.fragment.app.Fragment
import com.gonexwind.myapp.databinding.FragmentPersegiBinding
import kotlin.math.pow

class PersegiFragment : Fragment() {

    private var _binding: FragmentPersegiBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentPersegiBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.hitungButton.setOnClickListener {
            val sisi = binding.sisiEditText.text.toString().toDouble()
            val luas = sisi.pow(2)
            val keliling = sisi + sisi + sisi + sisi

            binding.luasTextView.text = "Luas : $luas"
            binding.kelilingTextView.text = "Keliling : $keliling"

            binding.luasTextView.isVisible = true
            binding.kelilingTextView.isVisible = true
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}