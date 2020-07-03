/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package S2E6P1;

/**
 *
 * @author DELL
 */
public class NhanVien {
    private String Manv;
    private String Hoten;
    private String Que;
    private double hesoluong;

    public String getManv() {
        return Manv;
    }

    public String getHoten() {
        return Hoten;
    }

    public String getQue() {
        return Que;
    }

    public double getHesoluong() {
        return hesoluong;
    }

    public void setManv(String Manv) {
        this.Manv = Manv;
    }

    public void setHoten(String Hoten) {
        this.Hoten = Hoten;
    }

    public void setQue(String Que) {
        this.Que = Que;
    }

    public void setHesoluong(double hesoluong) {
        this.hesoluong = hesoluong;
    }
    public NhanVien()
    {
    }

    public NhanVien(String Manv, String Hoten, String Que, double hesoluong) {
        this.Manv = Manv;
        this.Hoten = Hoten;
        this.Que = Que;
        this.hesoluong = hesoluong;
    }
    
}
