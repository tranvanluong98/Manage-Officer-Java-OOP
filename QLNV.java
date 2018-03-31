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
public class QLNV {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        DSNV l1  = new DSNV(50);
        NhanVien nv1 , nv2 ;
        NVHD nvHD1 = new NVHD("+Trinh Ngoc Khang", "P102", 2000000, "HD");
        NVHD nvHD2 = new NVHD("+Vu Hieu", "P102", 3000000, "HD");
        NVBC nvHD3 = new NVBC("+Tran Van Luong", "P102", 3, 3);
           nv2 = new NhanVien();
           nv2.setHoTen("Luong");
           nv2.setPhong("P102");
           l1.themNV(nv2);
           
           l1.themNV(nvHD1);
           l1.themNV(nvHD2);
           l1.themNV(nvHD3);
           System.out.println("\t\t - Tất ca nhân viên là: ");
           l1.lietKe();
           System.out.println("\t\t - Danh sách các NV HD la");
           l1.lietKe("HD");
           System.out.println("\t\t - Danh sách nhân viên BC là: ");
           l1.lietKe("BC");
    }
    
}
