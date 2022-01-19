package com.mirfanrafif.smartumkm.view.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.mirfanrafif.smartumkm.core.datasource.local.entity.Kategori
import com.mirfanrafif.smartumkm.core.datasource.local.entity.Produk
import com.mirfanrafif.smartumkm.databinding.FragmentProdukBinding
import com.mirfanrafif.smartumkm.view.viewmodel.SmartHargaDetailViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class ProdukFragment : Fragment() {
    private lateinit var binding: FragmentProdukBinding
    private val viewModel: SmartHargaDetailViewModel by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        binding = FragmentProdukBinding.inflate(inflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        //TODO("membuat tabel dan mengisi data")
    }

    companion object {
        const val ARG_KATEGORI = "kategori"
        const val ARG_PRODUK = "produk"
        @JvmStatic
        fun newInstance(kategori: Kategori, produk: ArrayList<Produk>) =
            ProdukFragment().apply {
                arguments = Bundle().apply {
                    putParcelable(ARG_KATEGORI, kategori)
                    putParcelableArrayList(ARG_PRODUK, produk)
                }
            }
    }
}