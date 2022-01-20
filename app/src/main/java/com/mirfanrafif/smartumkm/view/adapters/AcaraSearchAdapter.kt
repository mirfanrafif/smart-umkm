package com.mirfanrafif.smartumkm.view.adapters

import android.widget.RatingBar
import com.bumptech.glide.Glide
import com.chad.library.adapter.base.BaseQuickAdapter
import com.chad.library.adapter.base.viewholder.BaseViewHolder
import com.mirfanrafif.smartumkm.R
import com.mirfanrafif.smartumkm.core.datasource.local.entity.Acara

class AcaraSearchAdapter(listAcara: List<Acara>): BaseQuickAdapter<Acara, BaseViewHolder>(
    R.layout.item_smart_acara_cari, listAcara.toMutableList()) {
    override fun convert(holder: BaseViewHolder, item: Acara) {
        Glide.with(holder.itemView).load(item.gambar).into(holder.getView(R.id.img_smart_acara_cari))
        holder.setText(R.id.tv_smart_acara_cari, item.nama)
        holder.getView<RatingBar>(R.id.rating_smart_acara).rating = 3.5F
    }
}