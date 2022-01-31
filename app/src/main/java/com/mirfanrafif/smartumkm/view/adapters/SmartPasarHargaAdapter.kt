package com.mirfanrafif.smartumkm.view.adapters

import com.chad.library.adapter.base.BaseQuickAdapter
import com.chad.library.adapter.base.viewholder.BaseViewHolder
import com.mirfanrafif.smartumkm.R
import com.mirfanrafif.smartumkm.core.datasource.local.preferences.Harga

class SmartPasarHargaAdapter(val listHarga: List<Harga>): BaseQuickAdapter<Harga, BaseViewHolder>(R.layout.item_smart_pasar_detail_harga, listHarga.toMutableList()) {
    override fun convert(holder: BaseViewHolder, item: Harga) {
        holder.setText(R.id.tv_smart_harga_detail_item_nama_pasar, item.namaPasar)
        holder.setText(R.id.tv_smart_harga_detail_item_harga, item.harga.toString())
    }
}