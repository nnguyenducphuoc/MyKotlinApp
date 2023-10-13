package com.phuoc.mykotlinapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        var sv1: SinhVien = SinhVien()
        var sv2: SinhVien = SinhVien("Nguyễn Đức Hoàng", "Quảng Nam", 1992)

        sv1.setHoTen("Nguyễn Đức Phước")
        sv1.setDiaChi("Hà Nội")
        sv1.setNamSinh(2000)

        Log.d("AA", sv1.getHoTen() + " - " + sv1.getDiaChi() + " - " + sv1.getNamSinh())
        Log.d("AA", sv2.toString())

        val phuongTien: PhuongTien = PhuongTien("Xe đạp", "đen", 2)
        Log.d("AA", "${phuongTien.ten}")
    }
}