/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package W1E1P1;

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
        Molecule[] mList = new Molecule[100];
        
        System.out.print("Nhap so nguyen tu: ");
        int n = myVar.nextInt();
        
        for(int i = 0; i < n;i++)
        {
            System.out.println("Nhap nguyen tu thu " + (i+1));
            System.out.print("Nhap ten nguyen tu: ");
            String name = myVar.next();
            System.out.print("Nhap cau tao nguyen tu: ");
            String structure = new Scanner(System.in).next();
            double weight;
            do
            {
                System.out.print("Nhap trong luong: ");
                weight = myVar.nextDouble();
            }
             while(weight < 0 || weight >= 100);
            
            mList[i] = new Molecule(structure,name,weight);       
        }
    
        System.out.println("Danh sach cacnguyen tu: ");
        System.out.printf("%-16s%-15s%-30s%-15s%n","STT","Name","Structure","Weight");
        for(int i = 0;i < n;i ++)
        {
            System.out.print((i+1)+"\t\t");
            mList[i].display();
            
       
        }
    }
}
