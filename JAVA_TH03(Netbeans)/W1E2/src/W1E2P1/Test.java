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
public class Test {
    static double searchMaxPrice(Product[] arr,int n)
    {
        double max = arr[0].getPrice();
    
        for(int i = 0;i < n;i++)
        {
            if(arr[i].getPrice() > max)
            {
                max = arr[i].getPrice();
            }
        }
        return max;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n;
        String company;
        Scanner myVar = new Scanner(System.in);
        
        System.out.print("Nhap so luong san pham: ");
        n = myVar.nextInt();
        
        Product[] pList = new Product[n]; 
        for(int i = 0;i < n;i ++ )
        {
            pList[i] = new Product();
        }
         System.out.println("Hay nhap danh sach san pham: ");
        for(int i = 0;i < n;i ++ )
        {
            System.out.println("Nhap san pham thu " + (i+1));
            pList[i].inputProduct();
        }
        System.out.println("Danh sach cac san pham: ");
        System.out.println("STT\t\tID\t\tNAME\t\tCOMPANY\t\tCOLOUR\t\tPRICE\t\tDISCOUNT");
         for(int i = 0;i < n;i ++ )
        {
            System.out.print(i+1+"\t\t");
            pList[i].outputProduct();
           
        }
         double maxPrice = searchMaxPrice(pList,n);
         System.out.println("Danh sach san pham co gia lon nhat: ");
         System.out.println("STT\t\tID\t\tNAME\t\tCOMPANY\t\tCOLOUR\t\tPRICE\t\tDISCOUNT");
         for(int i = 0;i < n;i++)
         {
             if(pList[i].getPrice() == maxPrice)
             {
                 System.out.print(i+1+"\t\t");
                 pList[i].outputProduct();
             }
         }
         System.out.println("Danh sach san pham co mau RED hoac BLUE: ");
          System.out.println("STT\t\tID\t\tNAME\t\tCOMPANY\t\tCOLOUR\t\tPRICE\t\tDISCOUNT");
          for(int i = 0;i < n;i++)
         {
             if(pList[i].getColor().equals("BLUE") || pList[i].getColor().equals("RED"))
             {
                 System.out.print(i+1+"\t\t");
                 pList[i].outputProduct();            
             }
         }
         System.out.print("Nhap ten cong ty can tim kiem: ");
         company = new Scanner(System.in).nextLine();
         System.out.println("Danh sach san pham thuoc cong ty: ");
         System.out.println("STT\t\tID\t\tNAME\t\tCOMPANY\t\tCOLOUR\t\tPRICE\t\tDISCOUNT");
         for(int i = 0;i < n;i++)
         {
             if(pList[i].getCompany().equals(company) )
             {
                 System.out.print(i+1+"\t\t");
                 pList[i].outputProduct();            
             }
         }
         
         
             
     
    }
    
}
