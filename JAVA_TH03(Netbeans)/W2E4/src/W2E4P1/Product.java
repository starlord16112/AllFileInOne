/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package W2E4P1;

/**
 *
 * @author DELL
 */
public class Product extends Supplier{
    private String Name;
    private int Number;
    private int Price;

    public Product(String Name, int Number, int Price, String NameS, String Address) {
        super(NameS, Address);
        this.Name = Name;
        this.Number = Number;
        this.Price = Price;
    }
    
    public double Sell_Product()
    {
        double kq = 0;
        if(this.Number > 20)
        {
            kq += (this.Number * this.Price) * 0.8;
        }
        else
            kq += this.Number * this.Price;
        return kq;
    

    
    }
   
    
    public String toString()
    {
        String kq = "";
        System.out.println(super.toString());
        kq += super.toString() +  this.Name + "\t" + this.Number + "\t" + this.Price;
        return kq;
    }

}
