package com.gonexwind.myapp.about

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.gonexwind.myapp.R
import com.gonexwind.myapp.databinding.FragmentAboutBinding

class AboutFragment : Fragment() {

    private var _binding: FragmentAboutBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentAboutBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val instagram = "https://www.instagram.com/fikkyardianto/"
        val facebook = "https://www.facebook.com/gonexwind/"
        val twitter = "https://www.twitter.com/gonexwind/"

        binding.apply {
            instragramButton.setOnClickListener {
                findNavController().navigate(
                    AboutFragmentDirections.actionAboutFragmentToWebViewFragment(instagram)
                )
            }
            facebookButton.setOnClickListener {
                findNavController().navigate(
                    AboutFragmentDirections.actionAboutFragmentToWebViewFragment(facebook)
                )
            }
            twitterButton.setOnClickListener {
                findNavController().navigate(
                    AboutFragmentDirections.actionAboutFragmentToWebViewFragment(twitter)
                )
            }
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}