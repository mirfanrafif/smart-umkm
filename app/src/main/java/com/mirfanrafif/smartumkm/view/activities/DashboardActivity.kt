package com.mirfanrafif.smartumkm.view.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import androidx.recyclerview.widget.GridLayoutManager
import com.mirfanrafif.smartumkm.MyApplication
import com.mirfanrafif.smartumkm.R
import com.mirfanrafif.smartumkm.databinding.ActivityDashboardBinding
import com.mirfanrafif.smartumkm.utils.ViewModelFactory
import com.mirfanrafif.smartumkm.view.adapters.FiturAdapter
import com.mirfanrafif.smartumkm.view.adapters.FiturItem
import com.mirfanrafif.smartumkm.view.viewmodel.DashboardViewModel
import java.text.SimpleDateFormat
import java.util.*
import javax.inject.Inject

class DashboardActivity : AppCompatActivity() {

    private lateinit var binding: ActivityDashboardBinding
    private var fiturList = mutableListOf<FiturItem>()

    @Inject
    lateinit var factory: ViewModelFactory

    private val viewModel: DashboardViewModel by viewModels {
        factory
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDashboardBinding.inflate(layoutInflater)
        (application as MyApplication).appComponent.inject(this)
        setContentView(binding.root)
    }

    override fun onStart() {
        super.onStart()
        fiturList = mutableListOf(
            FiturItem("Smart Laba", R.drawable.smart_laba, Intent(this, SmartLabaActivity::class.java)),
            FiturItem("Smart Modal", R.drawable.smart_modal, Intent(this, SmartModalActivity::class.java))
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