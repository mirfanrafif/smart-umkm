package com.mirfanrafif.smartumkm.view.adapters

import android.widget.ImageButton
import com.bumptech.glide.Glide
import com.chad.library.adapter.base.BaseQuickAdapter
import com.chad.library.adapter.base.viewholder.BaseViewHolder
import com.mirfanrafif.smartumkm.R
import com.mirfanrafif.smartumkm.core.datasource.local.entity.Pasar

class PasarAdapter(data: List<Pasar>): BaseQuickAdapter<Pasar, BaseViewHolder>(R.layout.item_pasar, data.toMutableList()) {
    override fun convert(holder: BaseViewHolder, item: Pasar) {
        Glide.with(holder.itemView).load(item.gambar).into(holder.getView(R.id.img_pasar))
        holder.setText(R.id.tv_pasar_nama, item.nama)
        holder.getView<ImageButton>(R.id.btn_item_pasar_next).setOnClickListener {  }
    }
}