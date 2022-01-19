package com.mirfanrafif.smartumkm.view.activities

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.mirfanrafif.smartumkm.databinding.ActivitySmartLabaBinding
import com.mirfanrafif.smartumkm.view.adapters.PengeluaranAdapter
import com.mirfanrafif.smartumkm.view.viewmodel.SmartLabaViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class SmartLabaActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySmartLabaBinding

    private val viewModel: SmartLabaViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySmartLabaBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setSupportActionBar(binding.toolbar)
        binding.imgBack.setOnClickListener {
            finish()
        }

    }

    override fun onStart() {
        super.onStart()
        val pengeluaranList = viewModel.getPengeluaranList()
        val adapter = PengeluaranAdapter(pengeluaranList)
        binding.content.rvPengeluaran.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        binding.content.rvPengeluaran.adapter = adapter
    }
}