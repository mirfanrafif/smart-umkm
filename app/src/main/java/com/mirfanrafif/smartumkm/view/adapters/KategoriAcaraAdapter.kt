package com.mirfanrafif.smartumkm.view.adapters

import com.bumptech.glide.Glide
import com.chad.library.adapter.base.BaseQuickAdapter
import com.chad.library.adapter.base.viewholder.BaseViewHolder
import com.mirfanrafif.smartumkm.R
import com.mirfanrafif.smartumkm.core.datasource.local.entity.KategoriAcara
import com.mirfanrafif.smartumkm.utils.IMoveToAnotherFragment

class KategoriAcaraAdapter(
    data: List<KategoriAcara>,
    private val moveToAnotherFragment: IMoveToAnotherFragment
) : BaseQuickAdapter<KategoriAcara, BaseViewHolder>(
    R.layout.item_kategori_acara,
    data.toMutableList()
) {
    override fun convert(holder: BaseViewHolder, item: KategoriAcara) {
        holder.setText(R.id.tv_item_kategori_acara, item.nama)
        Glide.with(holder.itemView).load(item.gambar).into(holder.getView(R.id.img_kategori_acara))
        holder.itemView.setOnClickListener {
            moveToAnotherFragment.move(item)
        }
    }
}