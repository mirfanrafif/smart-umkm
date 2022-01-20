package com.mirfanrafif.smartumkm.view.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.bumptech.glide.Glide
import com.mirfanrafif.smartumkm.R
import com.mirfanrafif.smartumkm.core.datasource.local.entity.Acara
import com.mirfanrafif.smartumkm.databinding.FragmentSmartAcaraDetailBinding
import dagger.hilt.android.AndroidEntryPoint

class SmartAcaraDetailFragment : Fragment() {

    private lateinit var binding: FragmentSmartAcaraDetailBinding
    private var acara: Acara? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            acara = it.getParcelable(ARG_ACARA)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentSmartAcaraDetailBinding.inflate(inflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        acara?.let {
            Glide.with(binding.root).load(it.gambar).into(binding.imgSmartAcaraList)
            binding.tvSmartAcaraListNama.text = it.nama
            binding.tvSmartAcaraListPelaksanaan.text = resources.getString(
                R.string.pelaksanaan_acara, it.tanggalMulai, it.tanggalSelesai)
            binding.tvSmartAcaraListKuota.text = resources.getString(R.string.kuota, it.kuota.toString())
            binding.tvSmartAcaraListLokasi.text = it.lokasi
            binding.tvSmartAcaraDetailDeskripsi.text = it.deskripsi
            binding.tvSmartAcaraDetailDurasi.text = resources.getString(R.string.durasi_acara, it.durasi)
            binding.tvSmartAcaraDetailManfaat.text = resources.getString(R.string.manfaat_acara, it.manfaat)
            binding.tvSmartAcaraDetailRegistrasi.text = resources.getString(R.string.registrasi_acara, if(it.registrasi > 0) it.registrasi.toString() else "gratis")
            binding.tvSmartAcaraDetailPenyelenggara.text = resources.getString(R.string.penyelenggara_acara, it.penyelenggara)
            binding.btnAcaraDetailDaftar.setOnClickListener {
                requireActivity().supportFragmentManager.beginTransaction()
                    .replace(R.id.container_smart_acara, SmartAcaraBookingFragment.newInstance())
                    .addToBackStack(null)
                    .commit()
            }
        }
    }

    companion object {
        private const val ARG_ACARA = "acara"
        @JvmStatic
        fun newInstance(acara: Acara) =
            SmartAcaraDetailFragment().apply {
                arguments = Bundle().apply {
                    putParcelable(ARG_ACARA, acara)
                }
            }
    }
}