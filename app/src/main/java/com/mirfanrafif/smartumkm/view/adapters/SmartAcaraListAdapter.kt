package com.mirfanrafif.smartumkm.view.adapters

import com.chad.library.adapter.base.BaseQuickAdapter
import com.chad.library.adapter.base.viewholder.BaseViewHolder
import com.mirfanrafif.smartumkm.R
import com.mirfanrafif.smartumkm.core.datasource.local.entity.Acara
import com.mirfanrafif.smartumkm.utils.IMoveToAnotherFragment

class SmartAcaraListAdapter(
    data: List<Acara>,
    private val moveToAnotherFragment: IMoveToAnotherFragment
): BaseQuickAdapter<Acara, BaseViewHolder>(
    R.layout.item_smart_acara_list, data.toMutableList()
) {
    override fun convert(holder: BaseViewHolder, item: Acara) {
        holder.setText(R.id.tv_smart_acara_list_nama, item.nama)
        holder.setImageResource(R.id.img_smart_acara_list, item.gambar)
        holder.setText(R.id.tv_smart_acara_list_pelaksanaan, "Pelaksanaan : ${item.tanggalMulai} - ${item.tanggalSelesai}")
        holder.setText(R.id.tv_smart_acara_list_kuota, "Kuota: ${item.kuota} orang")
        holder.setText(R.id.tv_smart_acara_list_lokasi, item.lokasi)
        holder.itemView.setOnClickListener {
            moveToAnotherFragment.move(item)
        }
    }
}