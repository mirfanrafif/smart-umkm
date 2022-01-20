package com.mirfanrafif.smartumkm.view.fragments

import android.os.Bundle
import android.os.Parcelable
import android.view.KeyEvent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.recyclerview.widget.LinearLayoutManager
import com.mirfanrafif.smartumkm.R
import com.mirfanrafif.smartumkm.core.datasource.local.entity.KategoriAcara
import com.mirfanrafif.smartumkm.databinding.FragmentSmartAcaraDashboardBinding
import com.mirfanrafif.smartumkm.utils.IMoveToAnotherFragment
import com.mirfanrafif.smartumkm.view.adapters.AcaraSearchAdapter
import com.mirfanrafif.smartumkm.view.adapters.KategoriAcaraAdapter
import com.mirfanrafif.smartumkm.view.viewmodel.SmartAcaraDashboardViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class SmartAcaraDashboardFragment : Fragment() {

    private lateinit var binding: FragmentSmartAcaraDashboardBinding
    private val viewModel: SmartAcaraDashboardViewModel by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentSmartAcaraDashboardBinding.inflate(inflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.edtAcaraCari.setOnKeyListener { _, i, keyEvent ->
            if (i == KeyEvent.KEYCODE_ENTER) {
                viewModel.setKeyword(binding.edtAcaraCari.text.toString())
                return@setOnKeyListener true
            }
            return@setOnKeyListener false
        }
        viewModel.searchKeyword().observe(viewLifecycleOwner) {
            if(it.isBlank()) {
                binding.llSmartAcaraSearch.visibility = View.GONE
            }else{
                binding.llSmartAcaraSearch.visibility = View.VISIBLE
                viewModel.searchAcara(it)
            }
        }

        viewModel.acaraListSearch().observe(viewLifecycleOwner) {
            val adapter = AcaraSearchAdapter(it)
            binding.rvSmartAcaraSearch.layoutManager = LinearLayoutManager(binding.root.context)
            binding.rvSmartAcaraSearch.adapter = adapter
        }

        val adapter = KategoriAcaraAdapter(viewModel.getKategoriAcaraList(), object :
            IMoveToAnotherFragment {
            override fun move(data: Parcelable) {
                val kategori = data as KategoriAcara
                requireActivity().supportFragmentManager.beginTransaction()
                    .replace(R.id.container_smart_acara, SmartAcaraListFragment.newInstance(kategori))
                    .addToBackStack(null)
                    .commit()
            }

        })
        binding.rvSmartAcaraKategori.adapter = adapter
        binding.rvSmartAcaraKategori.layoutManager = LinearLayoutManager(
            binding.root.context,
            LinearLayoutManager.HORIZONTAL,
            false
        )
    }

    companion object {
        @JvmStatic
        fun newInstance() =
            SmartAcaraDashboardFragment().apply {
                arguments = Bundle().apply {
                }
            }
    }
}