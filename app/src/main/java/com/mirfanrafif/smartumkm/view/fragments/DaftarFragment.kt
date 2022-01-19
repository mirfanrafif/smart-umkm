package com.mirfanrafif.smartumkm.view.fragments

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.mirfanrafif.smartumkm.MyApplication
//import com.mirfanrafif.smartumkm.MyApplication
import com.mirfanrafif.smartumkm.databinding.FragmentDaftarBinding
import com.mirfanrafif.smartumkm.utils.ViewModelFactory
import com.mirfanrafif.smartumkm.view.activities.DashboardActivity
import com.mirfanrafif.smartumkm.view.viewmodel.LoginViewModel
import javax.inject.Inject

/**
 * A simple [Fragment] subclass.
 * Use the [DaftarFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class DaftarFragment : Fragment() {

    private lateinit var binding: FragmentDaftarBinding

    @Inject
    lateinit var factory: ViewModelFactory
    private val loginViewModel: LoginViewModel by viewModels {
        factory
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        (requireActivity().application as MyApplication).appComponent.inject(this)
    }

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