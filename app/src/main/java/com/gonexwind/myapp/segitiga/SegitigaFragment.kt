package com.gonexwind.myapp.segitiga

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.view.isVisible
import androidx.fragment.app.Fragment
import com.gonexwind.myapp.databinding.FragmentSegitigaBinding

class SegitigaFragment : Fragment() {

    private var _binding: FragmentSegitigaBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentSegitigaBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.hitungButton.setOnClickListener {
            val alas = binding.alasEditText.text.toString().toDouble()
            val tinggi = binding.alasEditText.text.toString().toDouble()
            val luas = 0.5 * alas * tinggi
            binding.luasTextView.text = "Luas: $luas"
            binding.luasTextView.isVisible = true
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}