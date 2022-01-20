package com.mirfanrafif.smartumkm.view.fragments

import android.os.Bundle
import android.os.Parcelable
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.recyclerview.widget.LinearLayoutManager
import com.mirfanrafif.smartumkm.R
import com.mirfanrafif.smartumkm.core.datasource.local.entity.Acara
import com.mirfanrafif.smartumkm.core.datasource.local.entity.KategoriAcara
import com.mirfanrafif.smartumkm.databinding.FragmentSmartAcaraListBinding
import com.mirfanrafif.smartumkm.utils.IMoveToAnotherFragment
import com.mirfanrafif.smartumkm.view.adapters.SmartAcaraListAdapter
import com.mirfanrafif.smartumkm.view.viewmodel.SmartAcaraDashboardViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class SmartAcaraListFragment : Fragment() {
    // TODO: Rename and change types of parameters
    private var kategori: KategoriAcara? = null
    private lateinit var binding: FragmentSmartAcaraListBinding
    private val viewModel: SmartAcaraDashboardViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            kategori = it.getParcelable(ARG_KATEGORI)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        binding = FragmentSmartAcaraListBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val adapter = SmartAcaraListAdapter(viewModel.getListAcara(), object : IMoveToAnotherFragment {
            override fun move(data: Parcelable) {
                val acara = data as Acara
                viewModel.setAcara(acara)
                requireActivity().supportFragmentManager.beginTransaction()
                    .replace(R.id.container_smart_acara, SmartAcaraDetailFragment.newInstance(acara))
                    .addToBackStack(null)
                    .commit()
            }

        })
        binding.rvSmartAcaraList.layoutManager = LinearLayoutManager(binding.root.context)
        binding.rvSmartAcaraList.adapter = adapter
    }

    companion object {
        private const val ARG_KATEGORI = "kategori"

        @JvmStatic
        fun newInstance(kategori: KategoriAcara) =
            SmartAcaraListFragment().apply {
                arguments = Bundle().apply {
                    putParcelable(ARG_KATEGORI, kategori)
                }
            }
    }
}