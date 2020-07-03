/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package S2E2P1;

/**
 *
 * @author DELL
 */
public class HocVien {
    
    private double DiemThi;

    /**
     * Get the value of DiemThi
     *
     * @return the value of DiemThi
     */
    public double getDiemThi() {
        return DiemThi;
    }

    /**
     * Set the value of DiemThi
     *
     * @param DiemThi new value of DiemThi
     */
    public void setDiemThi(double DiemThi) {
        this.DiemThi = DiemThi;
    }

    public HocVien() {
    }

    public HocVien(double DiemThi, String Hoten, String Quequan, String Mahv) {
        this.DiemThi = DiemThi;
        this.Hoten = Hoten;
        this.Quequan = Quequan;
        this.Mahv = Mahv;
    }


    private String Hoten;

    /**
     * Get the value of Hoten
     *
     * @return the value of Hoten
     */
    public String getHoten() {
        return Hoten;
    }

    /**
     * Set the value of Hoten
     *
     * @param Hoten new value of Hoten
     */
    public void setHoten(String Hoten) {
        this.Hoten = Hoten;
    }

    private String Quequan;

    /**
     * Get the value of Quequan
     *
     * @return the value of Quequan
     */
    public String getQuequan() {
        return Quequan;
    }

    /**
     * Set the value of Quequan
     *
     * @param Quequan new value of Quequan
     */
    public void setQuequan(String Quequan) {
        this.Quequan = Quequan;
    }

    private String Mahv;

    /**
     * Get the value of Mahv
     *
     * @return the value of Mahv
     */
    public String getMahv() {
        return Mahv;
    }

    /**
     * Set the value of Mahv
     *
     * @param Mahv new value of Mahv
     */
    public void setMahv(String Mahv) {
        this.Mahv = Mahv;
    }

    
}
