package com.mirfanrafif.smartumkm.view.activities

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import com.mirfanrafif.smartumkm.databinding.ActivitySmartHargaDetailBinding
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
    }

    override fun onStart() {
        super.onStart()
        //TODO("mengerjakan viewpager2 dengan 1 fragment diisi data yang berbeda")
    }
}