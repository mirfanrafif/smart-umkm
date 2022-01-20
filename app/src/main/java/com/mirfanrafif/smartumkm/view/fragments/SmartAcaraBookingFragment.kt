package com.mirfanrafif.smartumkm.view.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.mirfanrafif.smartumkm.databinding.FragmentSmartAcaraBookingBinding

class SmartAcaraBookingFragment : Fragment() {
    private lateinit var binding: FragmentSmartAcaraBookingBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        binding = FragmentSmartAcaraBookingBinding.inflate(inflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.btnAcaraBookingBackHome.setOnClickListener {
            requireActivity().finish()
        }
    }

    companion object {
        @JvmStatic
        fun newInstance() =
            SmartAcaraBookingFragment().apply {
                arguments = Bundle().apply {
                }
            }
    }
}