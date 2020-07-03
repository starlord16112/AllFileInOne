/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package S2E3P1;

/**
 *
 * @author DELL
 */
public abstract class MatHang {
    private String Mamh;
    private String Ten;
    private double dongia;

    public MatHang()
    {
        
    }

    public MatHang(String Mamh, String Ten, double dongia) {
        this.Mamh = Mamh;
        this.Ten = Ten;
        this.dongia = dongia;
    }
    
    public void setMamh(String Mamh) {
        this.Mamh = Mamh;
    }

    public void setDongia(double dongia) {
        this.dongia = dongia;
    }
    
    public void setTen(String Ten)
    {
        this.Ten = Ten;
        
    }
    public String getTen()
    {
        return Ten;
    }

    public String getMamh() {
        return Mamh;
    }

    public double getDongia() {
        return dongia;
    }
    
    
    
}
