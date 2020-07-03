/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package S2E1P1;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner myVar = new Scanner(System.in);
        
        System.out.print("nhap canh 1: ");
        double c1 = myVar.nextDouble();
        System.out.print("nhap canh 2: ");
        double c2 = myVar.nextDouble();
        System.out.print("nhap canh 3: ");
        double c3 = myVar.nextDouble();
        
        TamGiac obj = new TamGiac(c1,c2,c3);
        if(obj.kiemtra())
        {
            System.out.println("chu vi: "+obj.tinhchuvi());
            System.out.println("dien tich: "+obj.tinhdientich());
            
        }
        else
        {
            System.out.println("khong phai 3 canh tam giac");
        }
    }
    
}
