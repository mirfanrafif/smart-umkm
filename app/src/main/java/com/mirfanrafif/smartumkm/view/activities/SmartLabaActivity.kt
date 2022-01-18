package com.mirfanrafif.smartumkm.view.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import androidx.recyclerview.widget.LinearLayoutManager
import com.mirfanrafif.smartumkm.MyApplication
import com.mirfanrafif.smartumkm.databinding.ActivitySmartLabaBinding
import com.mirfanrafif.smartumkm.utils.ViewModelFactory
import com.mirfanrafif.smartumkm.view.adapters.PengeluaranAdapter
import com.mirfanrafif.smartumkm.view.viewmodel.SmartLabaViewModel
import javax.inject.Inject

class SmartLabaActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySmartLabaBinding

    @Inject
    lateinit var factory: ViewModelFactory

    private val viewModel: SmartLabaViewModel by viewModels {
        factory
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySmartLabaBinding.inflate(layoutInflater)
        setContentView(binding.root)
        (application as MyApplication).appComponent.inject(this)
        setSupportActionBar(binding.toolbar)
        binding.imgBack.setOnClickListener {
            finish()
        }

    }

    override fun onStart() {
        super.onStart()
        val pengeluaranList = viewModel.getPengeluaranList()
        val adapter = PengeluaranAdapter(pengeluaranList)
        binding.rvPengeluaran.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        binding.rvPengeluaran.adapter = adapter
    }
}