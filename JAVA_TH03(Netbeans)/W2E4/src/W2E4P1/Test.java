/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package W2E4P1;

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
        System.out.print("Enter name of supplier: ");
        String NameS = new Scanner(System.in).nextLine();
        System.out.print("Enter name of adress: ");
        String Address = new Scanner(System.in).nextLine();
        System.out.print("Enter name of product: ");
        String Name = new Scanner(System.in).nextLine();
        System.out.print("Enter price: ");
        int Price = myVar.nextInt();
        System.out.print("Enter number: ");
        int Number= myVar.nextInt();
        System.out.print("Enter TC: ");
        int TC = myVar.nextInt();
        Product sp = new Product(Name,Number,Price, NameS, Address);
        switch(TC)
        {
            case 1:
                System.out.println(sp);
                break;
            case 2:
                System.out.println(sp.Sell_Product());
                break;
            default:
                System.out.println("lỗi");
        }
    }
    
}
