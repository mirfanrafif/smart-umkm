package com.mirfanrafif.smartumkm.view.adapters

import android.content.Intent
import com.bumptech.glide.Glide
import com.chad.library.adapter.base.BaseQuickAdapter
import com.chad.library.adapter.base.viewholder.BaseViewHolder
import com.mirfanrafif.smartumkm.R
import com.mirfanrafif.smartumkm.core.datasource.local.entity.Barang
import com.mirfanrafif.smartumkm.view.activities.SmartHargaDetailActivity
import com.mirfanrafif.smartumkm.view.activities.SmartPasarDetailActivity

class SmartPasarBarangAdapter(val listHarga: List<Barang>): BaseQuickAdapter<Barang, BaseViewHolder>(R.layout.item_smart_pasar_barang, listHarga.toMutableList()) {
    override fun convert(holder: BaseViewHolder, item: Barang) {
        Glide.with(holder.itemView.context).load(item.imageUrl).into(holder.getView(R.id.img_smart_pasar_barang))
        holder.setText(R.id.tv_smart_pasar_barang_kategori, item.kategori)
        holder.setText(R.id.tv_smart_pasar_barang_nama, item.nama)
        holder.setText(R.id.tv_smart_pasar_barang_harga, item.harga.toString())
        holder.setText(R.id.tv_smart_pasar_barang_pasar, item.lokasi)
        holder.itemView.setOnClickListener {
            holder.itemView.context.startActivity(Intent(holder.itemView.context, SmartPasarDetailActivity::class.java).apply {
                putExtra(SmartHargaDetailActivity.EXTRA_PASAR, item)
            })
        }
    }
}