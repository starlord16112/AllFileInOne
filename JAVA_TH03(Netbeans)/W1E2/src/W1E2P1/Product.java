/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package W1E2P1;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class Product 
{

    public Product(String Name, String ID, String Company, String Color, double Price) {
        this.Name = Name;
        this.ID = ID;
        this.Company = Company;
        this.Color = Color;
        this.Price = Price;
    }
      
        public Product()
        {
        }
    private String Name;

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }


    
    private String ID;

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    private String Company;

    public String getCompany() {
        return Company;
    }

    public void setCompany(String Company) {
        this.Company = Company;
    }

    private String Color;

    public String getColor() {
        return Color;
    }

    public void setColor(String Color) {
        this.Color = Color;
    }

    private double Price;

    public double getPrice() {
        return Price;
    }

    public void setPrice(double Price) {
        this.Price = Price;
    }
    
    public double tinhGiamGia()
    {
        return (20  * this.Price) / 100;
    }
    public void inputProduct()
    {
        Scanner pvar = new Scanner(System.in);
        System.out.print("Nhap ten san pham : ");
        this.Name = pvar.nextLine();
        System.out.print("Nhap id : ");
        this.ID = pvar.nextLine();
        System.out.print("Nhap mau sac : ");
        this.Color = pvar.nextLine();
        System.out.print("Nhap gia : ");
        this.Price= pvar.nextDouble();
        System.out.print("Nhap cong ty: ");
        this.Company = new Scanner(System.in).nextLine();
    }
    public void outputProduct()
    {
        System.out.println(this.ID+"\t\t"+this.Name+"\t\t"+this.Company+"\t\t"+this.Color+"\t\t"+this.Price+"\t\t"+this.tinhGiamGia());   
    }
    

    
}
