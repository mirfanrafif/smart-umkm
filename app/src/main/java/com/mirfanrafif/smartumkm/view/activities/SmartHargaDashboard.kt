package com.mirfanrafif.smartumkm.view.activities

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.mirfanrafif.smartumkm.databinding.ActivitySmartHargaDashboardBinding
import com.mirfanrafif.smartumkm.view.adapters.PasarAdapter
import com.mirfanrafif.smartumkm.view.viewmodel.SmartHargaDashboardViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class SmartHargaDashboard : AppCompatActivity() {
    private lateinit var binding: ActivitySmartHargaDashboardBinding
    private val viewModel: SmartHargaDashboardViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySmartHargaDashboardBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    override fun onStart() {
        super.onStart()
        binding.content.rvPasar.adapter = PasarAdapter(viewModel.getListPasar())
        binding.content.rvPasar.layoutManager = LinearLayoutManager(this)
    }
}