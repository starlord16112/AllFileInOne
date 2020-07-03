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
public class TamGiac extends Shape{
    public TamGiac()
    {
    }

    public TamGiac(double canh1, double canh2, double canh3) {
        this.canh1 = canh1;
        this.canh2 = canh2;
        this.canh3 = canh3;
    }
    
    //declare property and getter setter
    private double canh1;
    public void setCanh1(double canh1)
    {
        this.canh1 = canh1;
    }
    public double getCanh1()
    {
        return this.canh1;
    }
    //declare property and getter setter
    private double canh2;
    public void setCanh2(double canh2)
    {
        this.canh2 = canh2;
    }
    public double getCanh2()
    {
        return this.canh2;
    }
    //declare property and getter setter
    private double canh3;
    public void setCanh3(double canh3)
    {
        this.canh3 = canh3;
    }
    public double getCanh3()
    {
        return this.canh3;
    }
    
    //user define method
    public boolean kiemtra()
    {
        return((this.canh1 + this.canh2 > this.canh3 ) && (this.canh1 + this.canh3 > this.canh2 ) &&(this.canh2 + this.canh3 > this.canh1 ));
    }
    public double tinhchuvi()
    {
        return this.canh1 + this.canh2 + this.canh3;
    }
    public double tinhdientich()
    {
        double nuaChuVi = this.tinhchuvi() / 2;
        return Math.sqrt(nuaChuVi * (nuaChuVi - canh1) * (nuaChuVi - canh2) * (nuaChuVi - canh3));
    }
}
