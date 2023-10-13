package com.phuoc.mykotlinapp

class SinhVien {
    private var HoTen: String = ""
    private var DiaChi: String = ""
    private var NamSinh: Int? = null


    constructor(HoTen: String, DiaChi: String, NamSinh: Int?) {
        this.HoTen = HoTen
        this.DiaChi = DiaChi
        this.NamSinh = NamSinh
    }

    constructor()

    fun setDiaChi(diaChi: String) {
        DiaChi = diaChi
    }

    fun getDiaChi(): String {
        return DiaChi
    }

    fun setHoTen(hoTen: String) {
        HoTen = hoTen
    }

    fun getHoTen(): String {
        return HoTen
    }

    fun setNamSinh(ns: Int) {
        if (ns < 2004) {
            NamSinh = ns
        } else {
            NamSinh = 2003
        }
    }

    fun getNamSinh(): Int? {
        return NamSinh
    }

    override fun toString(): String {
        return "SinhVien(HoTen='$HoTen', DiaChi='$DiaChi', NamSinh=$NamSinh)"
    }


}