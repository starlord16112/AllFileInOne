/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package S3E7P1;

/**
 *
 * @author DELL
 */
public class GiaoVien {
    private String MaGV;
    private String HoTen;
    private String DiaChi;
    private double HeSoLuong;

    public String getDiaChi() {
        return DiaChi;
    }

    public void setMaGV(String MaGV) {
        this.MaGV = MaGV;
    }

    public void setHoTen(String HoTen) {
        this.HoTen = HoTen;
    }

    public void setHeSoLuong(double HeSoLuong) {
        this.HeSoLuong = HeSoLuong;
    }

    public void setDiaChi(String DiaChi) {
        this.DiaChi = DiaChi;
    }

    public String getMaGV() {
        return MaGV;
    }

    public double getHeSoLuong() {
        return HeSoLuong;
    }

    public String getHoTen() {
        return HoTen;
    }
    
    public GiaoVien()
    {
        
    }

    public GiaoVien(String MaGV, String HoTen, String DiaChi, double HeSoLuong) {
        this.MaGV = MaGV;
        this.HoTen = HoTen;
        this.DiaChi = DiaChi;
        this.HeSoLuong = HeSoLuong;
    }
    
}
