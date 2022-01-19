package com.mirfanrafif.smartumkm.view.adapters

import com.bumptech.glide.Glide
import com.chad.library.adapter.base.BaseQuickAdapter
import com.chad.library.adapter.base.viewholder.BaseViewHolder
import com.mirfanrafif.smartumkm.R
import com.mirfanrafif.smartumkm.core.datasource.local.entity.Produk

class ProdukAdapter(data: List<Produk>): BaseQuickAdapter<Produk, BaseViewHolder>(R.layout.item_produk,
    data.toMutableList()
) {
    override fun convert(holder: BaseViewHolder, item: Produk) {
        Glide.with(holder.itemView).load(R.drawable.tomat).into(holder.getView(R.id.img_produk))
        holder.setText(R.id.tv_produk_nama, item.nama)
        holder.setText(R.id.tv_produk_harga, "Rp ${item.harga}/kg")
    }

}