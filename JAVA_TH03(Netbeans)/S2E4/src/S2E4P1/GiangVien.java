/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package S2E4P1;

/**
 *
 * @author DELL
 */
public abstract class GiangVien {
    private String Ma;
    private String HoTen;
    private String DiaChi;

    public String getMa() {
        return Ma;
    }

    public String getHoTen() {
        return HoTen;
    }

    public String getDiaChi() {
        return DiaChi;
    }

    public void setMa(String Ma) {
        this.Ma = Ma;
    }

    public void setHoTen(String HoTen) {
        this.HoTen = HoTen;
    }

    public void setDiaChi(String DiaChi) {
        this.DiaChi = DiaChi;
    }

    public GiangVien() {
    }

    public GiangVien(String Ma, String HoTen, String DiaChi) {
        this.Ma = Ma;
        this.HoTen = HoTen;
        this.DiaChi = DiaChi;
    }
    
    public abstract void Nhap();
    public abstract void HienThi();
    
}
