package com.mirfanrafif.smartumkm.view.adapters

import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.mirfanrafif.smartumkm.core.datasource.local.entity.KategoriProduk
import com.mirfanrafif.smartumkm.core.datasource.local.entity.Produk
import com.mirfanrafif.smartumkm.view.fragments.ProdukFragment

class KategoriProdukFragmentAdapter(
    private val listKategoriProduk: List<KategoriProduk>,
    private val listProduk: ArrayList<Produk>,
    activity: AppCompatActivity
): FragmentStateAdapter(activity) {
    override fun getItemCount(): Int {
        return listKategoriProduk.size
    }

    override fun createFragment(position: Int): Fragment {
        return ProdukFragment.newInstance(listKategoriProduk[position], listProduk)
    }
}