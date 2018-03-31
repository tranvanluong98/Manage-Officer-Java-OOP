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
public class NVBC extends NhanVien{
    private int heSoLuong =0 ;
    private int soNamCongTac = 0;

    public NVBC(String ht , String phong , int heSoLuong , int soNamCongTac){
        super(ht , phong) ;
        this.heSoLuong = heSoLuong;
        this.soNamCongTac = soNamCongTac;
    }
    
    public String loaiNV(){
        return "BC";
    }
    
    public int layLuong(){
        int luongCoBan = 1000000;
        return heSoLuong*luongCoBan;
    }

    public void hienThi(){
        System.out.println(hoTen + "  Phong " + phong + " La NVBC co he so luong: " + heSoLuong + " So nam CT : " + soNamCongTac);
    }
    
    public int getHeSoLuong() {
        return heSoLuong;
    }

    public void setHeSoLuong(int heSoLuong) {
        this.heSoLuong = heSoLuong;
    }

    public int getSoNamCongTac() {
        return soNamCongTac;
    }

    public void setSoNamCongTac(int soNamCongTac) {
        this.soNamCongTac = soNamCongTac;
    }
    
}
