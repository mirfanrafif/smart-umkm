package com.mirfanrafif.smartumkm.utils

import com.mirfanrafif.smartumkm.R
import com.mirfanrafif.smartumkm.core.datasource.local.entity.*
import com.mirfanrafif.smartumkm.core.datasource.local.preferences.Harga

object DummyData {
    val dummyHarga = arrayListOf(
        Harga("Pasar Anyer Bahari", 31000, "Sama"),
        Harga("Pasar Bahariharjo", 31000, "Sama"),
        Harga("Pasar Cempaka", 30500, "Sama"),
        Harga("Pasar Cibubur", 32000, "Sama"),
        Harga("Pasar Cijantung", 32500, "Sama"),
        Harga("Pasar Cilama", 35000, "Sama"),
        Harga("Pasar Cipete", 33000, "Sama"),
        Harga("Pasar Cipete Putih", 30000, "Sama"),
        Harga("Pasar Ciplak", 35000, "Sama"),
        Harga("Pasar Glodok", 33000, "Sama"),
        Harga("Pasar Gondangdia", 34000, "Sama"),
        Harga("Pasar Grogol", 35000, "Sama"),
        Harga("Pasar Grogolan", 33000, "Sama"),
        Harga("Pasar Induk Kramat Jati", 30000, "Sama"),
        Harga("Pasar Jatinegara ", 29500, "Sama"),
    )
    val dummyPengeluaran = arrayListOf(
        Pengeluaran("Biaya Bahan Baku", R.drawable.bahan_baku, 650000),
        Pengeluaran("Biaya Transportasi", R.drawable.transportasi, 900000),
        Pengeluaran("Biaya Tenaga Kerja", R.drawable.tenaga_kerja, 850000)
    )

    val dummyKredit = arrayListOf(
        Kredit("BMT Bojonegoro", R.drawable.bmt, 650000),
        Kredit("Koperasi", R.drawable.koperasi, 900000),
        Kredit("Bank BRI", R.drawable.bri, 850000)
    )

    val dummyInvestasi = arrayListOf(
        Investasi("Properti", R.drawable.house),
        Investasi("Emas", R.drawable.emas),
        Investasi("Saham", R.drawable.saham)
    )

    val dummyPasar = arrayListOf(
        Pasar("Pasar Senen Jakarta", R.drawable.pasar),
        Pasar("Pasar Kebayoran Lama", R.drawable.pasar),
        Pasar("Pasar Kebayoran Baru", R.drawable.pasar)
    )

    val dummyProduk = arrayListOf(
        Produk("Tomat", 1, 10000),
        Produk("Wortel", 1, 12000),
        Produk("Terong", 1, 15000),
        Produk("Mentimun", 1, 8000),
        Produk("Cabai", 1, 20000)
    )

    val dummyKategoriAcara = arrayListOf(
        KategoriAcara("Mentoring", R.drawable.mentoring),
        KategoriAcara("Pelatihan", R.drawable.pelatihan),
        KategoriAcara("Magang", R.drawable.magang)
    )

    val dummyAcara = arrayListOf(
        Acara(
            "Pelatihan Desain Grafis: Design Kemasan",
            R.drawable.desain_kemasan,
            "20 Des 21",
            "27 Des 21",
            50,
            "Pelatihan dilakukan secara online",
            "Content creation adalah kemampuan dalam membuat dan mengelola konten digital seperti mengelola website, artikel web, desain grafis, video editing dan konten digital lainnya sangat dibutuhkan sebagai media promosi.",
            3,
            "Pelatihan ini memberikan kepada peserta pemahaman dan pengetahuan yang diperlukan agar dapat melakukan pembuatan dan pengeditan konten digital di media sosial secara lebih baik serta pemahaman bagaimana hak cipta dan lisensi diterapkan.",
            0,
            "IniBaru Company"
        ),
        Acara(
            "Pelatihan Content Creator: Media Sosial Sebagai Media Promosi",
            R.drawable.content_creator,
            "22 Des 21",
            "24 Des 21",
            50,
            "Pelatihan dilakukan secara online",
            "Content creation adalah kemampuan dalam membuat dan mengelola konten digital seperti mengelola website, artikel web, desain grafis, video editing dan konten digital lainnya sangat dibutuhkan sebagai media promosi.",
            3,
            "Pelatihan ini memberikan kepada peserta pemahaman dan pengetahuan yang diperlukan agar dapat melakukan pembuatan dan pengeditan konten digital di media sosial secara lebih baik serta pemahaman bagaimana hak cipta dan lisensi diterapkan.",
            0,
            "IniBaru Company"
        ),
        Acara(
            "Pelatihan Jasa Boga: Manajemen Pemasaran Usaha Jasa Boga",
            R.drawable.manajemen_pemasaran,
            "24 Des 21",
            "29 Des 21",
            10,
            "Pelatihan dilakukan secara online",
            "Content creation adalah kemampuan dalam membuat dan mengelola konten digital seperti mengelola website, artikel web, desain grafis, video editing dan konten digital lainnya sangat dibutuhkan sebagai media promosi.",
            3,
            "Pelatihan ini memberikan kepada peserta pemahaman dan pengetahuan yang diperlukan agar dapat melakukan pembuatan dan pengeditan konten digital di media sosial secara lebih baik serta pemahaman bagaimana hak cipta dan lisensi diterapkan.",
            0,
            "IniBaru Company"
        ),
    )

    val dummySmartPasarBarang = arrayListOf(
        Barang("Bawang", R.drawable.bawang_merah, "Bawang Merah", 32000, "Pasar Cempaka Putih"),
        Barang("Cabai", R.drawable.cabai_merah, "Cabai Merah", 38000, "Pasar Cibubur"),
        Barang("Bawang", R.drawable.bawang_putih, "Bawang Putih", 30000, "Pasar Jatinegara"),
        Barang("Beras", R.drawable.beras, "Beras IR 42/Pera", 12000, "Pasar Glondok"),
    )


}