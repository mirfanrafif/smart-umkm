package com.mirfanrafif.smartumkm.view.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import androidx.recyclerview.widget.LinearLayoutManager
import com.mirfanrafif.smartumkm.MyApplication
import com.mirfanrafif.smartumkm.R
import com.mirfanrafif.smartumkm.databinding.ActivitySmartModalBinding
import com.mirfanrafif.smartumkm.utils.ViewModelFactory
import com.mirfanrafif.smartumkm.view.adapters.InvestasiAdapter
import com.mirfanrafif.smartumkm.view.adapters.KreditAdapter
import com.mirfanrafif.smartumkm.view.viewmodel.SmartModalViewModel
import javax.inject.Inject

class SmartModalActivity : AppCompatActivity() {
    @Inject
    lateinit var factory: ViewModelFactory

    private val viewModel: SmartModalViewModel by viewModels {
        factory
    }

    private lateinit var binding: ActivitySmartModalBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySmartModalBinding.inflate(layoutInflater)
        (application as MyApplication).appComponent.inject(this)
        setContentView(binding.root)
        setSupportActionBar(binding.toolbar)
        binding.imgBack.setOnClickListener {
            finish()
        }
    }

    override fun onStart() {
        super.onStart()
        binding.content.rvKredit.adapter = KreditAdapter(viewModel.getAllKredit())
        binding.content.rvKredit.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)

        binding.content.rvInvestasi.layoutManager = LinearLayoutManager(this)
        binding.content.rvInvestasi.adapter = InvestasiAdapter(R.layout.item_investasi, viewModel.getAllInvestasi())
    }
}