package com.mirfanrafif.smartumkm.view.activities

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.bumptech.glide.Glide
import com.mirfanrafif.smartumkm.core.datasource.local.entity.Barang
import com.mirfanrafif.smartumkm.core.datasource.local.preferences.Harga
import com.mirfanrafif.smartumkm.databinding.ActivitySmartPasarDetailBinding
import com.mirfanrafif.smartumkm.view.adapters.SmartPasarHargaAdapter
import com.mirfanrafif.smartumkm.view.viewmodel.SmartPasarViewModel
import dagger.hilt.android.AndroidEntryPoint
import java.text.SimpleDateFormat
import java.util.*

@AndroidEntryPoint
class SmartPasarDetailActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySmartPasarDetailBinding
    private val viewModel: SmartPasarViewModel by viewModels()
    private var barang: Barang? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySmartPasarDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setSupportActionBar(binding.toolbar)
        barang = intent.getParcelableExtra(EXTRA_BARANG)
    }

    override fun onStart() {
        super.onStart()
        val hargaSorted = viewModel.getListHarga().sortedBy { harga: Harga -> harga.harga }
        val minHarga = hargaSorted[0]
        val maxHarga = hargaSorted[hargaSorted.size - 1]

        setMaxHargaData(maxHarga)
        setMinHargaData(minHarga)

        Glide.with(this).load(barang?.imageUrl).into(binding.imgSmartPasarDetailBarang)
        binding.tvToolbarTitle.text = barang?.nama

        binding.rvSmartPasarHarga.layoutManager = LinearLayoutManager(this)
        binding.rvSmartPasarHarga.adapter = SmartPasarHargaAdapter(viewModel.getListHarga())
        binding.tvSmartPasarDetailDate.text = SimpleDateFormat("DD MM yyyy", Locale.getDefault()).format(
            Date()
        )
    }

    private fun setMinHargaData(minHarga: Harga) {
        binding.tvSmartHargaDetailTerendahHarga.text = minHarga.harga.toString()
        binding.tvSmartPasarTerendahLokasi.text = minHarga.namaPasar
    }

    private fun setMaxHargaData(maxHarga: Harga) {
        binding.tvSmartHargaDetailTertinggiHarga.text = maxHarga.harga.toString()
        binding.tvSmartPasarTertinggiLokasi.text = maxHarga.namaPasar
    }

    companion object {
        const val EXTRA_BARANG = "extra_barang"
    }
}