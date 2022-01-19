package com.mirfanrafif.smartumkm.view.fragments

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.mirfanrafif.smartumkm.databinding.FragmentDaftarBinding
import com.mirfanrafif.smartumkm.view.activities.DashboardActivity
import com.mirfanrafif.smartumkm.view.viewmodel.LoginViewModel
import dagger.hilt.android.AndroidEntryPoint

/**
 * A simple [Fragment] subclass.
 * Use the [DaftarFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
@AndroidEntryPoint
class DaftarFragment : Fragment() {

    private lateinit var binding: FragmentDaftarBinding

    private val loginViewModel: LoginViewModel by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        binding = FragmentDaftarBinding.inflate(inflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.fabNext.setOnClickListener {
            loginViewModel.daftar(
                binding.edtNama.text.toString(),
                binding.tvUsername.text.toString(),
                binding.tvPassword.text.toString()
            )
            val intent = Intent(activity, DashboardActivity::class.java)
            startActivity(intent)
        }
    }

    companion object {
        @JvmStatic
        fun newInstance() =
            DaftarFragment().apply {
                arguments = Bundle().apply {

                }
            }
    }
}