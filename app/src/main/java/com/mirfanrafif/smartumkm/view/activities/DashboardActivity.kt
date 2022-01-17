package com.mirfanrafif.smartumkm.view.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import com.mirfanrafif.smartumkm.R
import com.mirfanrafif.smartumkm.databinding.ActivityDashboardBinding
import com.mirfanrafif.smartumkm.view.adapters.FiturAdapter
import com.mirfanrafif.smartumkm.view.adapters.FiturItem

class DashboardActivity : AppCompatActivity() {

    private lateinit var binding: ActivityDashboardBinding
    private var fiturList = mutableListOf<FiturItem>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDashboardBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    override fun onStart() {
        super.onStart()
        fiturList = mutableListOf(
            FiturItem("Smart Laba", R.drawable.smart_laba, Intent(this, SmartLabaActivity::class.java))
        )
        val adapter = FiturAdapter(fiturList)
        binding.rvFitur.layoutManager = GridLayoutManager(this, 2)
        binding.rvFitur.adapter = adapter
    }
}