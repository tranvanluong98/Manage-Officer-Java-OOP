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
public class NhanVien {

    protected String hoTen = "";
    protected String phong;

    public NhanVien() {
        hoTen = "";
        phong = "";
    }

    public NhanVien(String hoten, String soPhong) {
        this.hoTen = hoten;
        this.phong = soPhong;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getPhong() {
        return phong;
    }

    public void setPhong(String phong) {
        this.phong = phong;
    }

    public void hienThi() {
        System.out.println("Ho ten nhan vien " + hoTen + " \n" + "Phong: " + phong);
    }

    public String loaiNV() {
        return "";
    }

    public int layLuong() {
        return 0;
    }

    public boolean isNVHDDH() {
        return true;
    }
}
