package com.mirfanrafif.smartumkm.view.activities

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import com.mirfanrafif.smartumkm.R
import com.mirfanrafif.smartumkm.databinding.ActivitySmartAcaraDashboardBinding
import com.mirfanrafif.smartumkm.view.fragments.SmartAcaraDashboardFragment
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
        setSupportActionBar(binding.toolbar)
        binding.imgBack.setOnClickListener {
            finish()
        }

        supportFragmentManager.beginTransaction()
            .add(R.id.container_smart_acara, SmartAcaraDashboardFragment.newInstance() )
            .commit()
    }
}