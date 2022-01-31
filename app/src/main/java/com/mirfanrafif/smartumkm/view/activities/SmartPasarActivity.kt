package com.mirfanrafif.smartumkm.view.activities

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import com.mirfanrafif.smartumkm.databinding.ActivitySmartPasarBinding
import com.mirfanrafif.smartumkm.view.adapters.SmartPasarBarangAdapter
import com.mirfanrafif.smartumkm.view.viewmodel.SmartPasarViewModel
import dagger.hilt.android.AndroidEntryPoint
import java.text.SimpleDateFormat
import java.util.*

@AndroidEntryPoint
class SmartPasarActivity : AppCompatActivity() {
    private val viewModel: SmartPasarViewModel by viewModels()
    private lateinit var binding: ActivitySmartPasarBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySmartPasarBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setSupportActionBar(binding.toolbar)
    }

    override fun onStart() {
        super.onStart()
        binding.rvSmartPasarBarang.adapter = SmartPasarBarangAdapter(viewModel.getListBarang())
        binding.rvSmartPasarBarang.layoutManager = GridLayoutManager(this, 2)
        binding.tvSmartPasarDate.text = SimpleDateFormat("DD mm yyyy", Locale.getDefault()).format(Date())

        binding.tvSmartPasarLokasi.text = "Wisma Metland, Jl. Letjen Mt.Haryono Nomor 1"
    }
}