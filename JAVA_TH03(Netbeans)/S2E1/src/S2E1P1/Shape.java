/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package S2E1P1;

/**
 *
 * @author DELL
 */
public abstract class Shape {
    
    public Shape() {
    } 
    
    private String Mau;

    public String getMau() {
        return Mau;
    }

    public void setMau(String Mau) {
        this.Mau = Mau;
    }

    private boolean FillMau;

    public boolean isFillMau() {
        return FillMau;
    }

    public void setFillMau(boolean FillMau) {
        this.FillMau = FillMau;
    }
    
    public abstract  boolean kiemtra();
    public abstract double tinhdientich();  
    public abstract double tinhchuvi();
    
}
