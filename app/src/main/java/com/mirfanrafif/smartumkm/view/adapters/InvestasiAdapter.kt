package com.mirfanrafif.smartumkm.view.adapters

import com.bumptech.glide.Glide
import com.chad.library.adapter.base.BaseQuickAdapter
import com.chad.library.adapter.base.viewholder.BaseViewHolder
import com.mirfanrafif.smartumkm.R
import com.mirfanrafif.smartumkm.core.datasource.local.entity.Investasi

class InvestasiAdapter(layoutResId: Int, data: List<Investasi>): BaseQuickAdapter<Investasi, BaseViewHolder>(layoutResId, data.toMutableList()) {
    override fun convert(holder: BaseViewHolder, item: Investasi) {
        holder.setText(R.id.tv_investasi, item.nama)
        Glide.with(holder.itemView).load(item.gambar).into(holder.getView(R.id.img_investasi))
    }
}