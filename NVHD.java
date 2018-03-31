/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qlnv;

/**
 *
 * @author Tran Luong
 */
public class NVHD extends NhanVien {

    private int luong = 0;
    private String loaiHD = "";

    public NVHD(String ht, String p, int luong, String loaiHD) {
        super(ht, p);
        this.luong = luong;
        this.loaiHD = loaiHD;
    }

    public void hienThi() {
        System.out.println(hoTen + " Phong " + phong + " La NVHD co luong " + luong + " loai hop dong " + loaiHD);
    }

    @Override
    public String loaiNV() {
        return "HD"; 
    }

    

    public boolean isNVHDDH() {
        if (loaiHD.equals("DH")) {
            return true;
        } else {
            return false;
        }
    }

    public int getLuong() {
        return luong;
    }

    public void setLuong(int luong) {
        this.luong = luong;
    }

    public String getLoaiHD() {
        return loaiHD;
    }

    public void setLoaiHD(String loaiHD) {
        this.loaiHD = loaiHD;
    }

}
