package com.mirfanrafif.smartumkm.view.activities

import android.os.Bundle
import android.view.KeyEvent
import android.view.View
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.mirfanrafif.smartumkm.databinding.ActivitySmartAcaraDashboardBinding
import com.mirfanrafif.smartumkm.view.adapters.AcaraSearchAdapter
import com.mirfanrafif.smartumkm.view.adapters.KategoriAcaraAdapter
import com.mirfanrafif.smartumkm.view.viewmodel.SmartAcaraDashboardViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class SmartAcaraDashboardActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySmartAcaraDashboardBinding
    private val viewModel: SmartAcaraDashboardViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySmartAcaraDashboardBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.edtAcaraCari.setOnKeyListener { _, i, keyEvent ->
            if (i == KeyEvent.KEYCODE_ENTER) {
                viewModel.setKeyword(binding.edtAcaraCari.text.toString())
                return@setOnKeyListener true
            }
            return@setOnKeyListener false
        }
        viewModel.searchKeyword().observe(this) {
            if(it.isBlank()) {
                binding.llSmartAcaraSearch.visibility = View.GONE
            }else{
                binding.llSmartAcaraSearch.visibility = View.VISIBLE
                viewModel.searchAcara(it)
            }
        }

        viewModel.acaraListSearch().observe(this) {
            val adapter = AcaraSearchAdapter(it)
            binding.rvSmartAcaraSearch.layoutManager = LinearLayoutManager(binding.root.context)
            binding.rvSmartAcaraSearch.adapter = adapter
        }

        val adapter = KategoriAcaraAdapter(viewModel.getKategoriAcaraList())
        binding.rvSmartAcaraKategori.adapter = adapter
        binding.rvSmartAcaraKategori.layoutManager = LinearLayoutManager(
            binding.root.context,
            LinearLayoutManager.HORIZONTAL,
            false
        )
    }
}