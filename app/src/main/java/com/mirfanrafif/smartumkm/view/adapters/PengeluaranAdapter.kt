package com.mirfanrafif.smartumkm.view.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.mirfanrafif.smartumkm.core.datasource.local.entity.Pengeluaran
import com.mirfanrafif.smartumkm.databinding.ItemPengeluaranBinding

class PengeluaranAdapter(private val listPengeluaran: List<Pengeluaran>): RecyclerView.Adapter<PengeluaranAdapter.PengeluaranViewHolder>() {
    inner class PengeluaranViewHolder(private val binding: ItemPengeluaranBinding): RecyclerView.ViewHolder(binding.root) {
        fun bind(pengeluaran: Pengeluaran) {
            binding.tvPengeluaranTitle.text = pengeluaran.namaKategori
            binding.textView3.text = pengeluaran.jumlah.toString()
            Glide.with(binding.root).load(pengeluaran.gambar).into(binding.imgIconPengeluaran)
        }
    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): PengeluaranViewHolder {
        val binding = ItemPengeluaranBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return PengeluaranViewHolder(binding)
    }

    override fun onBindViewHolder(holder: PengeluaranViewHolder, position: Int) {
        holder.bind(listPengeluaran[position])
    }

    override fun getItemCount(): Int {
        return listPengeluaran.size
    }
}