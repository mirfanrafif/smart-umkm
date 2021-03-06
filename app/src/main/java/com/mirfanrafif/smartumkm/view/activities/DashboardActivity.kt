package com.mirfanrafif.smartumkm.view.activities

import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import com.mirfanrafif.smartumkm.R
import com.mirfanrafif.smartumkm.databinding.ActivityDashboardBinding
import com.mirfanrafif.smartumkm.utils.FiturItem
import com.mirfanrafif.smartumkm.view.adapters.FiturAdapter
import com.mirfanrafif.smartumkm.view.viewmodel.DashboardViewModel
import dagger.hilt.android.AndroidEntryPoint
import java.text.SimpleDateFormat
import java.util.*

@AndroidEntryPoint
class DashboardActivity : AppCompatActivity() {

    private lateinit var binding: ActivityDashboardBinding
    private var fiturList = mutableListOf<FiturItem>()

    private val viewModel: DashboardViewModel by viewModels()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDashboardBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    override fun onStart() {
        super.onStart()
        fiturList = mutableListOf(
            FiturItem("Smart Laba", R.drawable.smart_laba, Intent(this, SmartLabaActivity::class.java)),
            FiturItem("Smart Modal", R.drawable.smart_modal, Intent(this, SmartModalActivity::class.java)),
            FiturItem("Smart Harga", R.drawable.smart_harga, Intent(this, SmartHargaDashboardActivity::class.java)),
            FiturItem("Smart Acara", R.drawable.smart_acara, Intent(this, SmartAcaraDashboardActivity::class.java)),
            FiturItem("Smart Pasar", R.drawable.smart_pasar, Intent(this, SmartPasarActivity::class.java))
        )

        val user = viewModel.getUser()
        binding.tvProfileName.text = user.nama
        binding.textView4.text = SimpleDateFormat("EEEE, dd MM yyyy", Locale.getDefault()).format(
            Date()
        )

        val adapter = FiturAdapter(fiturList)
        binding.rvFitur.layoutManager = GridLayoutManager(this, 2)
        binding.rvFitur.adapter = adapter
    }
}