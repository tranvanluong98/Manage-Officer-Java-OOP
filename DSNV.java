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
public class DSNV extends NhanVien{
    private NhanVien ds[];
    private int soNV;
    public DSNV(int n){
        ds = new NhanVien[n];
        soNV = 0;
    }
    public void themNV(NhanVien nv){
        if(soNV < ds.length){
            ds[soNV++] = nv;
        }
    }
    
    public void lietKe (){
        for(int i = 0 ; i< soNV ; i++){
            ds[i].hienThi();
        }
        
    }
    
    public void lietKe(String loaiNV){
         for(int i = 0 ; i < soNV ; i++){
             if(ds[i].loaiNV().equals(loaiNV))
            ds[i].hienThi();
        }
    }
    
     public int tongluong()
    {
        int tl = 0;
        for(int i=0;i<soNV;i++) 
            tl += ds[i].layLuong();
         
        return tl;
    }
     
    public void dsNVHDDH()
    {
        for(int i=0;i<soNV;i++) 
            if(ds[i].loaiNV().equals("HD"))
            {
                if(ds[i].isNVHDDH())
                    ds[i].hienThi();
            }
                 
    }
}
