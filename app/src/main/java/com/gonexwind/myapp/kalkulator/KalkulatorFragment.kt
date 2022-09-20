package com.gonexwind.myapp.kalkulator

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.view.isVisible
import androidx.fragment.app.Fragment
import com.gonexwind.myapp.databinding.FragmentKalkulatorBinding

class KalkulatorFragment : Fragment() {

    private var _binding: FragmentKalkulatorBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentKalkulatorBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.apply {
            tambahButton.setOnClickListener {
                val angka1 = binding.angka1EditText.text.toString().toDouble()
                val angka2 = binding.angka2EditText.text.toString().toDouble()
                hasilTextView.text = "Hasil Tambah: ${angka1 + angka2}"
                hasilTextView.isVisible = true
            }
            kurangButton.setOnClickListener {
                val angka1 = binding.angka1EditText.text.toString().toDouble()
                val angka2 = binding.angka2EditText.text.toString().toDouble()
                hasilTextView.text = "Hasil Kurang: ${angka1 - angka2}"
                hasilTextView.isVisible = true
            }
            bagiButton.setOnClickListener {
                val angka1 = binding.angka1EditText.text.toString().toDouble()
                val angka2 = binding.angka2EditText.text.toString().toDouble()
                hasilTextView.text = "Hasil Bagi: ${angka1 / angka2}"
                hasilTextView.isVisible = true
            }
            kaliButton.setOnClickListener {
                val angka1 = binding.angka1EditText.text.toString().toDouble()
                val angka2 = binding.angka2EditText.text.toString().toDouble()
                hasilTextView.text = "Hasil Kali: ${angka1 * angka2}"
                hasilTextView.isVisible = true
            }
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}