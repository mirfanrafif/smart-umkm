package com.mirfanrafif.smartumkm.view.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.mirfanrafif.smartumkm.databinding.ActivitySmartLabaBinding

class SmartLabaActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySmartLabaBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySmartLabaBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setSupportActionBar(binding.toolbar)
        actionBar?.title = "Smart Laba"
    }

    override fun onStart() {
        super.onStart()
    }
}