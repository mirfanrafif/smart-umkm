package com.mirfanrafif.smartumkm.view.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.mirfanrafif.smartumkm.core.datasource.local.entity.Kredit
import com.mirfanrafif.smartumkm.databinding.ItemKreditBinding

class KreditAdapter(private val kreditList: List<Kredit>): RecyclerView.Adapter<KreditAdapter.KreditViewHolder>() {
    inner class KreditViewHolder(private val binding: ItemKreditBinding): RecyclerView.ViewHolder(binding.root) {
        fun bind(kredit: Kredit) {
            binding.tvKreditNama.text = kredit.nama
            binding.tvKreditIuran.text = kredit.tagihan.toString()
            Glide.with(binding.root).load(kredit.gambar).into(binding.imgKredit)
        }
    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): KreditViewHolder {
        val binding = ItemKreditBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return KreditViewHolder(binding)
    }

    override fun onBindViewHolder(holder: KreditViewHolder, position: Int) {
        holder.bind(kreditList[position])
    }

    override fun getItemCount(): Int {
        return kreditList.size
    }
}