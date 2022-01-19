package com.mirfanrafif.smartumkm.view.activities

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.tabs.TabLayoutMediator
import com.mirfanrafif.smartumkm.core.datasource.local.entity.Kategori
import com.mirfanrafif.smartumkm.core.datasource.local.entity.Produk
import com.mirfanrafif.smartumkm.databinding.ActivitySmartHargaDetailBinding
import com.mirfanrafif.smartumkm.view.adapters.KategoriFragmentAdapter
import com.mirfanrafif.smartumkm.view.viewmodel.SmartHargaDetailViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class SmartHargaDetailActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySmartHargaDetailBinding
    private val viewModel: SmartHargaDetailViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySmartHargaDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setSupportActionBar(binding.toolbar2)
        binding.imgBack.setOnClickListener {
            finish()
        }
    }

    override fun onStart() {
        super.onStart()
        //TODO("mengerjakan viewpager2 dengan 1 fragment diisi data yang berbeda")
        val listKategori = arrayListOf(
            Kategori("Sayur", "Harga sayur hari ini"),
            Kategori("Buah", "Harga buah hari ini"),
            Kategori("Sembako", "Harga sembako hari ini"),
        )
        val listProduk: ArrayList<Produk> = ArrayList()
        listProduk.addAll(viewModel.getListProduk())
        val kategoriFragmentAdapter = KategoriFragmentAdapter(listKategori, listProduk, this)
        binding.vpProduk.adapter = kategoriFragmentAdapter
        TabLayoutMediator(binding.tabs, binding.vpProduk) { tab, position ->
            tab.text = listKategori[position].nama
        }.attach()
    }

    companion object {
        const val EXTRA_PASAR = "extra_pasar"
    }
}