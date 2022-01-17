package com.mirfanrafif.smartumkm.view.adapters

import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.mirfanrafif.smartumkm.databinding.ItemFiturBinding

class FiturAdapter(private val fiturList: List<FiturItem>) : RecyclerView.Adapter<FiturAdapter.FiturViewHolder>() {
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): FiturAdapter.FiturViewHolder {
        val binding = ItemFiturBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return FiturViewHolder(binding)
    }

    inner class FiturViewHolder(private val binding: ItemFiturBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(fitur: FiturItem) {
            with(binding) {
                Glide.with(binding.root).load(fitur.gambar).into(binding.imgFitur)
                tvFitur.text = fitur.nama
                root.setOnClickListener {
                    root.context.startActivity(fitur.intent)
                }
            }
        }
    }

    override fun onBindViewHolder(holder: FiturAdapter.FiturViewHolder, position: Int) {
        holder.bind(fiturList[position])
    }

    override fun getItemCount(): Int = fiturList.size
}

data class FiturItem(
    val nama: String,
    val gambar: Int,
    val intent: Intent
)