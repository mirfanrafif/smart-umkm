package com.mirfanrafif.smartumkm.view.fragments

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
//import com.mirfanrafif.smartumkm.MyApplication
import com.mirfanrafif.smartumkm.databinding.FragmentDaftarBinding
import com.mirfanrafif.smartumkm.utils.ViewModelFactory
import com.mirfanrafif.smartumkm.view.activities.DashboardActivity
import com.mirfanrafif.smartumkm.view.viewmodel.LoginViewModel
import javax.inject.Inject

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [DaftarFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class DaftarFragment : Fragment() {

    private lateinit var binding: FragmentDaftarBinding

//    @Inject
//    lateinit var factory: ViewModelFactory
//    private val loginViewModel: LoginViewModel by viewModels {
//        factory
//    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
//        (requireActivity().application as MyApplication).appComponent.inject(this)
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
//            loginViewModel.daftar(
//                binding.edtNama.text.toString(),
//                binding.tvUsername.text.toString(),
//                binding.tvPassword.text.toString()
//            )
            val intent = Intent(activity, DashboardActivity::class.java)
            startActivity(intent)
        }
    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment DaftarFragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance() =
            DaftarFragment().apply {
                arguments = Bundle().apply {

                }
            }
    }
}